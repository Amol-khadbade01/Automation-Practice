package RestAssuredTest;

import org.springframework.context.PayloadApplicationEvent;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

public class RestTestExample2 {

	
	@Test
	public void Rest_TestMethod() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String res = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(AllPayload.Add_place()).when().post("/maps/api/place/add/json").then().assertThat()
				.statusCode(200).body("scope", equalTo("APP")).extract().response().asString();

		System.out.println(res);
		JsonPath js = new JsonPath(res);// for parse the value

		String placeId = js.getString("place_id");

		// Update place
		String newaddress = "Dist Beed Tq Kaij pin code 431123";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"" + newaddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200);
		System.out.println(res);

		// Get address

		String Getres = given().queryParam("key", "qaclick123").queryParam("place_id", placeId).when()
				.get("maps/api/place/get/json").then().statusCode(200).extract().response().asString();
		JsonPath js1 = new JsonPath(Getres);
		String add = js1.getString("address");
		System.out.println("The address is -->" + add);
		assertEquals(add, newaddress);

	}

}
