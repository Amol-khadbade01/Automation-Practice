package DemoRestAssuredpractice;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DemoTest_get {

	// Base URl =https://reqres.in/
	// resources URl=api/users?page=2

	RequestSpecBuilder reqspec = new RequestSpecBuilder();

	public void setup() {
		reqspec = (RequestSpecBuilder) RestAssured.given().baseUri("https://reqres.in/api/users?page=2");

	}

	@Test
	public void Get_method() {

	}

}
