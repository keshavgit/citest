package com.ci;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDemo {
	WebDriver driver;
	@Before
	public void setUp()
	{
		driver=new FirefoxDriver(); 
	}
	@Test
	public void testWebDemo() throws InterruptedException
	{
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
