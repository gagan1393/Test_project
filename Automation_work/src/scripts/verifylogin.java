package scripts;

import org.testng.annotations.Test;

import pom.login;

public class verifylogin extends Basetest
{
	@Test
	public void verifyloginfb() throws InterruptedException
	{
	login l1 = new login(driver);
	l1.Enterusername("abc@gmail.com");
	Thread.sleep(2000);
	l1.Enterpassword("gdggggggggg");
	l1.clicklogin();

}}
