package demo;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import Pojo.ecommerce_deserial;
import Pojo.ecommerce_serial;
import Pojo.orders;
import Pojo.ordersList;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class EcommerceAPI {

	public static void main(String[] args) {

//LOGIN API-extract token
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();

		ecommerce_serial serial = new ecommerce_serial();
		serial.setUserEmail("vijay1220@gmail.com");
		serial.setUserPassword("Vijay@1220");

		RequestSpecification input = given().log().all().relaxedHTTPSValidation().spec(req).body(serial);

		ecommerce_deserial response = input.when().post("/api/ecom/auth/login").then().log().all().extract().response()
				.as(ecommerce_deserial.class);

		String token = response.getToken();
		System.out.println(token);
		String userID = response.getUserId();
		System.out.println(userID);

		// ADD A PRODUCT

		RequestSpecification product = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).build();

		RequestSpecification details = given().log().all().spec(product).param("productName", "vijays")
				.param("productAddedBy", userID).param("productCategory", "fashion")
				.param("productSubCategory", "shirts").param("productPrice", "11500")
				.param("productDescription", "origina").param("productFor", "women")
				.multiPart("productImage", new File("C://User//hariv//pic.jpg"));

		String result = details.when().post("/api/ecom/product/add-product").then().log().all().extract().response()
				.asString();

		JsonPath js = new JsonPath(result);
		String productid = js.getString("productId");
		System.out.println(productid);

		// Create order
//	body:
		{
//		    "orders": [
//		        {
//		            "country": "India",
//		            "productOrderedId": "64845cc6568c3e9fb183a07f"
//		        }
//		    ]
//		}

		RequestSpecification checkout = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("authorization", token).setContentType(ContentType.JSON).build();
//for simple json
		
		orders inputs = new orders();   //create pojo class for simple inside  json, create its obj and set data for country,productid
		inputs.setCountry("India"); 
		inputs.setProductOrderedId(productid);

		
//for list of json      
		List<orders> ol = new ArrayList<orders>();       //orders is a list so create an object for array list and add pojo class obj 
		ol.add(inputs);

		ordersList olb = new ordersList(); // create a pojo class for orders list ,create its obj and set arraylist in  objecg
		olb.setOrdersList(ol);

		RequestSpecification data = given().log().all().spec(checkout).body(olb);

		String orderResponse = data.when().post("/api/ecom/order/create-order").then().log().all().extract().response()
				.asString();

		System.out.println(orderResponse);
		
		
		//delete
		RequestSpecification deleteProdBaseReq=	new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("authorization", token).setContentType(ContentType.JSON)
				.build();

				RequestSpecification deleteProdReq =given().log().all().spec(deleteProdBaseReq).pathParam("productId",productid);

				String deleteProductResponse = deleteProdReq.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all().
				extract().response().asString();

				JsonPath js1 = new JsonPath(deleteProductResponse);

				Assert.assertEquals("Product Deleted Successfully",js1.get("message"));


	}

}
}
