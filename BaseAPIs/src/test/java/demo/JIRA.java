package demo;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class JIRA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "http://localhost:8080";

		SessionFilter s = new SessionFilter();

		// Create new session

		String response = given().log().all().header("Content-type", "application/json")
				.body("{ \"username\": \"vijaykumarramakrishna1220\", \"password\": \"Vijay@1220\" }").filter(s).when()
				.post("/rest/auth/1/session").then().log().all().extract().response().asString();

		// Add Comment

		given().log().all().pathParam("key", "10002").header("Content-type", "application/json")
				.body("{\r\n" + "    \"body\": \"vijaykumars select \",\r\n"
						+ "    \"visibility\": {\r\n" + "        \"type\": \"role\",\r\n"
						+ "        \"value\": \"Administrators\"\r\n" + "    }\r\n" + "}")
				.filter(s).post("/rest/api/2/issue/{key}/comment").then().log().all().assertThat().statusCode(201);

//		 Add Attachment

		given().header("X-Atlassian-Token", "no-check").header("Content-type", "multipart/form-data")
				.pathParam("Key", "10001").filter(s)
				.multiPart("file", new File(System.getProperty("user.dir") + "\\src\\test\\java\\demo\\JiraAttachment"))
				.when().post("/rest/api/2/issue/{Key}/attachments").then().assertThat().statusCode(200);

		// get issue

		String getissue = given().pathParam("Key", "10002").queryParam("fields", "comment")
				.filter(s).when().get("/rest/api/2/issue/{Key}")
				.then().log().all()
				.assertThat().statusCode(200).extract().response().asString();
		//System.out.println(getissue);
		JsonPath jp=new JsonPath(getissue);
	String com=	jp.getString("fields.comment.comments[0].id");
	System.out.println(com);
		

	}

}
