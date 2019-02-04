package com.webdriver.programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksMercury {
	WebDriver driver;

	public LinksMercury(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void openApplication(String appUrl)
	{
		driver.get(appUrl);//open application
		driver.manage().window().maximize();
	}
	public void links() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> links=driver.findElements(By.cssSelector("a"));
		
			
		String linklist[] = new String[links.size()];	
		for(int i=0;i<links.size();i++)
		{
			String ab=links.get(i).getText();
			System.out.println(ab);
			
			
			linklist[i] = links.get(i).getAttribute("href");
			
		}
		
		for(String i : linklist){
			
			//driver.navigate().to(i);
			driver.get(i);
			Thread.sleep(2000);
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		LinksMercury g=new LinksMercury(driver);
		g.openApplication("http://newtours.demoaut.com/");
		g.links();
		driver.quit();
	}

}
