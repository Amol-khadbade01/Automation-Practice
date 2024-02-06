package api.endpoint;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import api.paylod.User;
import io.restassured.response.Response;

//User end point java file which is create for CRUD opetaion 
//create read update and delete request 

public class UserEndPoints {

	public static Response createUser(User payload) {
		Response responces = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload).when()
				.post(Routes.post_url);
		return responces;
	}

	//GET Method 
	public static Response readUser(String userName) {
		Response responces = given()
				.pathParam("username", userName)
				.when()
				.get(Routes.get_url);
		return responces;
	}
	
	
	//Update user  
	public static Response updateteUser(String UserName, User payload) {
		Response responces = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("username", UserName)
				.body(payload).when()
				.put(Routes.update_url);
		return responces;
	}
	
	
	public static Response deleteUser(String userName) {
		Response responces = given()
				.pathParam("username", userName)
				.when()
				.get(Routes.delete_url);
		return responces;
	}
	
}
