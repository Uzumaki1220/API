package demo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Library {

	@Test(dataProvider="BulkBooks")
	public void Addbook(String isbn,String aisle) {
		RestAssured.baseURI = "http://216.10.245.166";
		String AddResponse = given().headers("content-type", "application/json").body(Payloads.AddBookPayload(isbn,aisle)).when()
				.post("/Library/Addbook.php").then().assertThat().log().all().statusCode(200).extract().response()
				.asString();
		System.out.println(AddResponse);
		JsonPath js = new JsonPath(AddResponse);
		String ID = js.getString("ID");
		System.out.println(ID);

	}

	
	@DataProvider(name="BulkBooks")
	public Object[][] getData()
	{
		return new Object[][] {{"vvvv","kkkkk"},{"rrrr","kkkkkk"},{"uuuu","zzzzzzzzz"}};
	}
	
}
