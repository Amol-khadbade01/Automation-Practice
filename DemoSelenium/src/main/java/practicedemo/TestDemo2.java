package practicedemo;

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse number usnig String buffer
		int num=12345;
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		sb.reverse();
		System.out.println(sb);
		

	}
}

