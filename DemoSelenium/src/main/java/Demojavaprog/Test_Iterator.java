package Demojavaprog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test_Iterator {

	public static void main(String[] args) {
		
		List<String>listitem= new ArrayList<>();
		listitem.add("Fruit");
		listitem.add("mango");
		listitem.add("name");
		
		ListIterator<String> item= listitem.listIterator();
		//Iterator<String> item= listitem.iterator();
		
		while(item.hasNext())
		{
			String list=item.next();
			System.out.println(list);
		}
		
		while(item.hasPrevious())
		{
			String list=item.previous();
			System.out.println(list);
		}
		
		
		
		
	}

}
