package Demojavaprog;

import org.testng.annotations.Test;

public class TestDemo14 {

	@Test(expectedExceptions =ArithmeticException.class)
	public void method()
	{
		int a=10,b=0;
		int result=	a/b;
		System.out.println("");
	}
}
