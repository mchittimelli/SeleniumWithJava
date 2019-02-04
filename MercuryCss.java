package com.webdriver.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MercuryCss {
	WebDriver driver;

	public MercuryCss(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void openApplication(String appUrl)
	{
		driver.get(appUrl);//open application
		driver.manage().window().maximize();
		
	}
	public void login(String username,String password)
	{
	WebElement user =driver.findElement(By.cssSelector("input[name='userName']"));
	user.sendKeys(username);
	WebElement pass=driver.findElement(By.cssSelector("input[name='password']"));
	pass.sendKeys(password);
	driver.findElement(By.cssSelector("input[name='login']")).click();
	if(driver.findElement(By.cssSelector("input[name='tripType'][value='roundtrip']"))!=null)
	{
		System.out.println("round trip selected");
		driver.findElement(By.cssSelector("input[name='tripType'][value='oneway']")).click();
		WebElement passenger=driver.findElement(By.cssSelector("select[name='passCount']"));
		passenger.click();
		passenger.sendKeys("3");
		passenger.click();
		if(driver.findElement(By.cssSelector("select[name='fromPort']"))!=null)
		{
			if(driver.findElement(By.cssSelector("option[value='Paris']"))!=null)
			{
			driver.findElement(By.cssSelector("option[value='Paris']")).click();
			driver.findElement(By.cssSelector("input[name='findFlights']")).click();
			}
			else
			{
				System.out.println("Paris is not found");
			}
		}
		
	}
	
	
	
	}
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
        MercuryCss mc=new MercuryCss(driver);
        mc.openApplication("http://newtours.demoaut.com/");
        mc.login("mercury","mercury");
        driver.quit();
	}

}
