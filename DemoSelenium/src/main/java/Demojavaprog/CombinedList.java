package Demojavaprog;

import java.util.ArrayList;
import java.util.List;

public class CombinedList {
//. How to Add/Join/Combine two list?
	public static void main(String[] args) {
		
		
		List<String>list1= new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		List<String>list2= new ArrayList<String>();
		list2.add("e");
		list2.add("f");
		list2.add("g");
		list2.add("h");

		List<String>Combined_list= new ArrayList<String>(list1);
		Combined_list.addAll(list2);
		
		System.out.println(Combined_list);
		
		

	
	
	}

}
