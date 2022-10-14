package com.MavenCheckPkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MavenTestngclass {
	
	@BeforeMethod
	public void beforetest() {
		System.out.println("*******************This will appear before evry TEST***********8");
	}
	
	@Test
	public void test11111111111() {
		System.out.println("This will execute TEST1");
	}
	
	@Test
	public void test2() {
		System.out.println("This will execute TEST2");
	}
	
	@AfterMethod
	public void aftertest() {
		System.out.println("This will execute after evry TEST");
	}

}
