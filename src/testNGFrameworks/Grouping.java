package testNGFrameworks;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups="x")
	public void samsung(){
		System.out.println("android");
		
	}
	@Test(groups="x")
	public void onepluse(){
		System.out.println("android");

	}
	@Test (groups="y")
	public void iphone(){
		System.out.println("ios");

	}
	@Test(groups="x")
	public void redmi(){
		System.out.println("android");

		
	}
	@Test(groups="x")
	public void sony(){
		System.out.println("android");

		
	}
	@Test(groups="x")
	public void moto(){
		System.out.println("android");

		
	}

}
