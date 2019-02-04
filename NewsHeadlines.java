 package com.webdriver.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewsHeadlines {
	WebDriver driver;
	public NewsHeadlines(WebDriver driver) {
		this.driver = driver;
	}
	public void openApplication(String appUrl)
	{
		driver.get(appUrl);//open application
		driver.manage().window().maximize();
	}
	public void news()
	{
			driver.findElement(By.className("gb_sc")).click();
			driver.findElement(By.cssSelector(".products-section > ul:nth-child(8) > li:nth-child(4) > p:nth-child(2) > a:nth-child(1)")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement wb1=driver.findElement(By.className("section-content"));
			java.util.List<WebElement> list=wb1.findElements(By.tagName("h2"));
			for (int i = 0; i < list.size(); i++) {
				String heading=list.get(i).getText();
				System.out.println(heading);
				
			}
			WebElement wb=driver.findElement(By.className("section-list-content"));
			java.util.List<WebElement> e=wb.findElements(By.tagName("h2"));
			for (int i = 0; i < e.size(); i++) {
				String heading=e.get(i).getText();
				System.out.println(heading);
				
				
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Training_Softwares\\Krishna\\chromedriver.exe");
		WebDriver driver =new FirefoxDriver();//open browser
		NewsHeadlines n=new NewsHeadlines(driver);
		n.openApplication("http://www.google.co.in");
		n.news();
		//driver.quit();

	}

}
