package api.endpoint;

/*swagger URL --> https://petstore.swagger.io
 * 
 * Create user-->Method (POST):-https://petstore.swagger.io/v2/user
 * 
 *Get User-->Method (GET):- https://petstore.swagger.io/v2/user/{username}
 *Update user-->Method (PUT):- https://petstore.swagger.io/v2/user/{username}
 * 
 * 
*/
//We store all the URL and end point 
public class Routes {

	public static String base_url = "https://petstore.swagger.io/v2";

	// User module
	public static String post_url = base_url + "/user";
	public static String get_url = base_url + "/user/{username}";
	public static String update_url = base_url + "/user/{username}";
	public static String delete_url = base_url + "/user/{username}";

	// Store module

	// here we save the store module url

	// Peat Module URL

	// here we save the peat module url

}
