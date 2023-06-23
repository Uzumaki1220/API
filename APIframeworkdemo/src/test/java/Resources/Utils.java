package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {
	RequestSpecification req;

	public RequestSpecification requestSpecification() throws IOException {
		PrintStream log = new PrintStream(new File("logs.txt"));
		req = new RequestSpecBuilder().setBaseUri(BaseUri("baseURI")).addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(log)).addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON).build();
		return req;

	}

	public static String BaseUri(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(
				"src//test//java//Resources//global.properties");
		prop.load(file);
		return prop.getProperty(key);

	}

}
