package practicedemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class TestDemo4 {

	public static void main(String[] args) {
		// Declear one array and print all number;
		int a[] = { 10, 20, 30, 40 };
		for (int i = 0; i < a.length; i++) {
		//	System.out.println(a[i]);
		}

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("b");
		list.add("c");

		//System.out.println(list.get(1));
		for (int i = 0; i < list.size(); i++) {
			//System.out.print(list.get(i));
		}
		
		HashMap<Integer, String>listmap= new HashMap<Integer, String>();
		listmap.put(1, "Test user -1");
		listmap.put(2, "Test user -2");
		listmap.put(3, "mango");
	String result=	listmap.get(2);
	System.out.println(result);
		
		
	/*
	 * int x = 5; int y = 10; if (x < y) System.out.println("Apple"); else if (x >
	 * y) System.out.println("Ball"); else System.out.println("Cat");
	 */
	}
}
