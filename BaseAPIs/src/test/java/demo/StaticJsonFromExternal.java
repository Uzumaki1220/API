package demo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class StaticJsonFromExternal {

	@Test
	public void JsonFromLocal() throws IOException {
		RestAssured.baseURI = "https://rahulshettyacademy.com";

		// Add place
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\hariv\\OneDrive\\Documents\\vijay automation\\AddPlace.json")))).when().post("/maps/api/place/add/json").then().log().all().assertThat()
				.statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract()
				.response().asString();
		System.out.println(response);
		

	}

}
