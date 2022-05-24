package qsp;

import org.testng.annotations.Test;

public class TestNG 
{
	@Test(priority=1,enabled=false)
	public void signup()
	{
		System.out.println("signup");
		
	}
	@Test(priority=2,invocationCount=1,dependsOnMethods="signup")
	public void login()
	{
		System.out.println("logged in....");
	}

}
