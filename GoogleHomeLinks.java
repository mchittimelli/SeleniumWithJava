package com.webdriver.programs;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleHomeLinks {
	WebDriver driver;
	
 public GoogleHomeLinks(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void openApplication(String appUrl){
		driver.get(appUrl);
		driver.manage().window().maximize();
		
	}
	public void googleLinks()
	{
		
		/*	java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
				 
				System.out.println(links.size()); 
				for(int i=0;i<links.size();i++)
				{
				String s=	links.get(i).getText();
				System.out.println(i+1+" " +s);
				}*/
		
			WebElement element = driver.findElement(By.className("gb_ja gb_ca"));
					//System.out.println(links.size());
					java.util.List<WebElement> links = element.findElements(By.tagName("li") );
					System.out.println(links.size());  

		
		
		
		
	}

public static void main(String args[])
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\Training_Softwares\\Krishna\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		GoogleHomeLinks gLinks=new GoogleHomeLinks(driver);
		gLinks.openApplication("http://www.google.co.in");
		gLinks.googleLinks();
		driver.quit();
 }
 
}
