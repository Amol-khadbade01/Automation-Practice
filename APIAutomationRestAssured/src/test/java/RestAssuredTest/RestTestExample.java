package RestAssuredTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestTestExample {
@Test
	public void test1() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		res.getStatusCode();
		res.getTime();
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
		res.getBody().asString();
		System.out.println(res.getBody().asString());
		
	}

	

}
