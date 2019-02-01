package SeleniumTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningAnyWebsiteScreenshot {
public static void main(String[] ar) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","C:/Users/USER/Downloads/chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("http:\\www.gmail.com");
	driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("mchittimelli");;
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	  File DestFile=new File("C:/Mahesh/Pictures/test"+Math.random()+".png");

      //Copy file at destination

      FileUtils.copyFile(SrcFile, DestFile);
	driver.close();
	
}
}
