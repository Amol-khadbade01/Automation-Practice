package pojo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CheckUserdata {
	
	public static void main(String[] args) {
		Userdata userdata= new Userdata("abc@gmail.com", "suchil", 34, 98765432);
		
		 // Convert User object to JSON using Gson
        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(userdata);
       

        // Print the JSON representation
        System.out.println(json);
        
		

	}

}
