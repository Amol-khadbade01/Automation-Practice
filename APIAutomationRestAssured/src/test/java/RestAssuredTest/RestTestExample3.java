package RestAssuredTest;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class RestTestExample3 {

	@Test
	public static void CheckRest() {
		RestAssured.baseURI = "https://stg-api.werner.com";
		String resp = given().log().all().header("Content-Type", "application/json")
				.header("client_id", "cedb726eca9249978e927f64a6dd909b")
				.header("client_secret", "63c579DCe67f4256830545260f5A85e2")
				.header("X-Correlation-ID", "4000078734332022142727").body(AllPayload.PricePayload()).when()
				.post("/rating-xapi/v1/rates").then().assertThat().statusCode(200).extract().response().asString();
		System.out.println("Here is the out put for the price service ");
		System.out.println(resp);

		JsonPath js = new JsonPath(resp);
		String name = js.getString("requestor.name");
		System.out.println("+===================>" + name);

		// System.out.println("The correlation ID is -->"+name);

		JsonPath js1 = new JsonPath(AllPayload.PricePayload());
		int correlation_ID = js1.getInt("RateRequest.requestDetails.size()");
		System.out.println("The size of item present in requestDetails is -->" + correlation_ID);

	}

}
