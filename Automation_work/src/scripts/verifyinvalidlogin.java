package scripts;

import org.testng.annotations.Test;

import pom.login;

public class verifyinvalidlogin extends Basetest
{
	@Test
	public void invalidlogin() throws InterruptedException
	{
		login l2 = new login(driver);
		l2.Enterusername("vdvc");
		Thread.sleep(2000);
		l2.Enterpassword("hcdcdb");
		l2.clicklogin();
	}

}
