package SeleniumDemoProgram;

import java.util.HashMap;

import org.openqa.selenium.devtools.v113.css.model.Value;

import bsh.Capabilities;


public class selectbydropdown {
	
	public static void main(String[] args) {
		//Create a HashMap object called people that will store String keys and Integer values:
				
		HashMap<String, Integer> people= new HashMap<String , Integer>();
		people.put("Amol", 1);
		people.put("jon",2);
		people.put("sunil", 3);
		
	for(String i :people.keySet())
	{
		System.out.println("key: " + i + " value: " + people.get(i));
	}
	}

}
