package demo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI="https://rahulshettyacademy.com";

//Add place
String response=given().log().all().queryParam("key","qaclick123").header("Content-type", "application/json")
.body(Payloads.AddPlaceBody())
.when().post("/maps/api/place/add/json")
.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
.header("Server","Apache/2.4.41 (Ubuntu)").extract().response().asString();
	System.out.println(response);
	
	
	JsonPath js=new JsonPath(response);
String place=js.getString("place_id");
System.out.println(place);

//update place id
String newAddress = "Summer Walk, Africa";

given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
.body("{\r\n" + 
		"\"place_id\":\""+place+"\",\r\n" + 
		"\"address\":\""+newAddress+"\",\r\n" + 
		"\"key\":\"qaclick123\"\r\n" + 
		"}").
when().put("maps/api/place/update/json")
.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));

//get place

String newPlace=given().queryParam("key", "qaclick123").queryParam("place_id", place).header("Content-type","application-json")
.when().get("/maps/api/place/get/json")
.then().assertThat().log().all().statusCode(200).extract().response().asString();

	System.out.println(newPlace);
	JsonPath js1=new JsonPath(newPlace);
	String ActualAdd=js1.getString("address");
	System.out.println(ActualAdd);
	Assert.assertEquals(ActualAdd, newAddress);
	
	}
	
	

}
