package demo;

import static io.restassured.RestAssured.given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.path.json.JsonPath;

public class OauthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
		
		
		//get token
		String accessTokenResponse= given()
		.queryParam("code", "")
		.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.queryParam("grant_type", "authorization_code")
		.when().log().all()
		.post("https://www.googleapis.com/oauth2/v4/token").asString();
		System.out.println(accessTokenResponse);
		JsonPath js=new JsonPath(accessTokenResponse);
	String 	accessToken=js.getString("access_token");

		
		
		
		//actual request
		
		String response=given().queryParam("accessToken", "")
		.when().get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println(response);
		
		
		
	}

}
