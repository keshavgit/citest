package com.ci;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestWebDemo {
	WebDriver driver;
	@Before
	public void setUp() throws Exception
	{
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("jenkins.label","redhat5 && amd64");
		WebDriver driver = new RemoteWebDriver(new URL("http://172.168.1.18:6786/wd/hub"), cap);
		// driver = new RemoteWebDriver(new URL("http://172.168.0.114:5555/wd/hub"),cap);
	}
	@Test
	public void testWebDemo() throws InterruptedException, Exception
	{
		
//		driver.get("https://www.axisbank.co.in/");
		driver.get("https://www.google.co.in/");
		assertEquals("Google",driver.getTitle());
		driver.findElement(By.id("gbqfq")).sendKeys("Selenium");
		Thread.sleep(6000);
	}
	//@Ignore
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
