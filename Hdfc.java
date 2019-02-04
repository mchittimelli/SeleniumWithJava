package com.webdriver.programs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Hdfc {
    WebDriver driver;
    
    public Hdfc(WebDriver driver) {
		super();
		this.driver = driver;
	}


    public void openApplication(String appUrl){
		driver.get(appUrl);
		driver.manage().window().maximize();
		
	}
    public void validation()
    {
    	if(driver.findElement(By.xpath("//div[@class='selectedvalue']")).getText().equals("NetBanking"))
    	{
    		System.out.println("Present");
    	}
    	String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
    	String subWindowHandler = null;

    	java.util.Set<String> handles = driver.getWindowHandles(); // get all window handles
    	Iterator<String> iterator = handles.iterator();
    	while (iterator.hasNext()){
    	    subWindowHandler = iterator.next();
    	}
    	driver.switchTo().window(subWindowHandler); // switch to popup window
    	  driver.findElement(By.cssSelector("#cee_closeBtn")).click();                                          // perform operations on popup

    	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
    	driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
    	
    	
    	String parentWindowHandler1 = driver.getWindowHandle(); // Store your parent window
    	String subWindowHandler1 = null;

    	java.util.Set<String> handles1 = driver.getWindowHandles(); // get all window handles
    	Iterator<String> iterator1 = handles.iterator();
    	while (iterator1.hasNext()){
    	    subWindowHandler1 = iterator1.next();
    	}
    	driver.switchTo().window(subWindowHandler1); // switch to popup window
    	  driver.findElement(By.cssSelector("#cee_closeBtn")).click();                                          // perform operations on popup

    	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
    	
    }


	public static void main(String[] args) {
		
            WebDriver driver=new FirefoxDriver();
            Hdfc hd = new Hdfc(driver);
            hd.openApplication("http://www.hdfcbank.com/personal/home");
            hd.validation();
            
	}

}
