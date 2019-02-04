package com.webdriver.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailCreation {
	WebDriver driver;

	public GmailCreation(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void openApplication(String appUrl)
	{
		driver.get(appUrl);//open application
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[id='gb_70']")).click();
		driver.findElement(By.cssSelector("span[id='link-signup']")).click();
		
	}
	public void createAccount()
	{
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Pratyusha");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Nalluri");
		driver.findElement(By.cssSelector("input[id='GmailAddress']")).sendKeys("p70mepratyusha@gmail.com");
		driver.findElement(By.cssSelector("input[id='Passwd']")).sendKeys("Pratyu@123");
		driver.findElement(By.cssSelector("input[id='PasswdAgain']")).sendKeys("Pratyu@123");
	WebElement birthday=	driver.findElement(By.cssSelector("div[title='Birthday']"));
	birthday.sendKeys("December");
	driver.findElement(By.cssSelector("input[id='BirthDay']")).sendKeys("25");
	driver.findElement(By.cssSelector("input[id='BirthYear']")).sendKeys("1994");
	driver.findElement(By.cssSelector("#Gender > div:nth-child(1)")).sendKeys("Female");
	driver.findElement(By.cssSelector("input[id='RecoveryPhoneNumber']")).sendKeys("8121019656");
	driver.findElement(By.cssSelector("input[id='RecoveryEmailAddress']")).sendKeys("p70mepratyusha@gmail.com");
		
	}
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		GmailCreation gc=new GmailCreation(driver);
		gc.openApplication("http://www.google.co.in");
		gc.createAccount();
	}

}
