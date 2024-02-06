package RestAssuredTest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;//used to equal 

import org.springframework.test.web.reactive.server.JsonPathAssertions;
//Validate Add place API is working as expected 
// REST Assdured work on three principle 
//Given:- it take all the paramater 
//When  Submit the API Details 
//Then :- Validte the responce 

@Test
public class TestAssrudAPI {

	public void Test_API_ADD_place() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String responce = given().log().all().queryParam("key ", "qaclick123")
				.header("Content-Type", "application/json").body(AllPayload.Add_place()).when()
				.post("maps/api/place/add/json").then().assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("Server", "Apache/2.4.52 (Ubuntu)").header("Connection", equalTo("Keep-Alive")).extract()
				.response().asString();

		System.out.println(responce);
		
		JsonPath js= new JsonPath(responce);// for parse  the value
		
		String placeId=js.getString("place_id");
		String ref=js.get("reference");
		String takeID=js.getString("id");
		System.out.println("--------Below are value printer seperated ----------");
		System.out.println("Here is the place value:-->"+placeId);
		System.out.println("Here is the refrence value :-->"+ref);
		System.out.println("her is the ID value :-->"+takeID);

	}

}
