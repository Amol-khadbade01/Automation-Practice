package JavaExamples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizationDemo implements Serializable 
{
	
	
	int i=10;
	int j=20;
}
 class test{
	 
	 	public static void main(String[] args) throws IOException {
	 		
	 		//serilization 
	 		SerilizationDemo sd = new SerilizationDemo();
	 				FileOutputStream fos= new FileOutputStream("abc.ser");
	 				ObjectOutputStream oos =new ObjectOutputStream(fos);
	 				oos.writeObject(sd);
	 				
	 				//de serilization

	}

}

 
