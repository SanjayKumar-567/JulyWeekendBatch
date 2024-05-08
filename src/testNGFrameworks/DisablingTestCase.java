package testNGFrameworks;

import org.testng.annotations.Test;

public class DisablingTestCase {
	@Test
	public void f1(){
	System.out.println("printing f1.....");
	}

	@Test
	public void f2(){
	System.out.println("printing f2.....");
	}

	@Test(enabled=false)//f3 will not excute other than f3 all cases wil  /lbe excute
	public void f3(){
	System.out.println("printing f3.....");
	}

	@Test
	public void f4(){
	System.out.println("printing f4.....");
	}


}
