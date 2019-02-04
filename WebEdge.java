package com.webdriver.programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebEdge {
	
	WebDriver driver;
	public WebEdge(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void openApplication(String appUrl){
		driver.get(appUrl);
		driver.manage().window().maximize();
		
	}
	public void gSearch(String keyword)
	{
	
		WebElement element = driver.findElement(By.className("gb_ja gb_ca"));
		
		java.util.List<WebElement> links = element.findElements(By.tagName("li") );
		System.out.println(links.size()); 
	}
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Mahesh\\Desktop\\testing complete\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		FirstWebDriverProgram wd=new FirstWebDriverProgram(driver);
		wd.openApplication("http://www.google.co.in");
		wd.gSearch("WebServer");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.quit();
		
	}
	}



