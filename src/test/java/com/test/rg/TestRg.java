package com.test.rg;

import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRg {
	@Test
	public void google() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Facebook");
		Thread.sleep(5000);
		driver.quit();

	}
	@Test
	public void Facebook() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Facebook",Keys.ENTER);
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		Thread.sleep(5000);
		driver.quit();

	}
}

