package write;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException
	{
		 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("/html/body/div/header/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		String parent =driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[2]/a")).click();
		 
		 
	  Set<String>allwindows = driver.getWindowHandles();
	  System.out.println(allwindows.size());
	  
	  for(String child:allwindows)
	  {
		  if(!parent.contentEquals(child))
		  {
			  driver.switchTo().window(child);
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			  
			 try{
			 TakesScreenshot ts = (TakesScreenshot)driver;
			  File f = ts.getScreenshotAs(OutputType.FILE);
			  File n = new File("C:\\project eclipe\\contains syntax\\screen\\sc.png");
			  Files.copy(f, n);
			 }catch(Exception e)
			 {
				 System.out.println(e);
			 }
		  }
	  }
	  driver.switchTo().window(parent);
	  try{
			 TakesScreenshot ts = (TakesScreenshot)driver;
			  File f1 = ts.getScreenshotAs(OutputType.FILE);
			  File n1 = new File("C:\\project eclipe\\contains syntax\\screen\\sp.png");
			  Files.copy(f1, n1);
			 }catch(Exception e)
			 {
				 System.out.println(e);
			 }
	}

}
