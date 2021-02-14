package com.SeleniumCompleteTutorials.qa.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// driver.findelement(By.name(""));



public class Using_Name {

	public static WebDriver driver;
	
public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");

	WebElement first_name = driver.findElement(By.name("firstName"));

	first_name.sendKeys("Amit");
	
}
	
	

}
