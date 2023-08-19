package write;

 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookCreate {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://facebook.com");
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Karishma");
	driver.findElement(By.name("lastname")).sendKeys("Rajendra");
	driver.findElement(By.name("reg_email__")).sendKeys("karishma123@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("raja1234");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("karishma123@gmail.com");
   
	
	 Select day = new Select(driver.findElement(By.id("day")));
	 day.selectByIndex(5);
	 Select month = new Select(driver.findElement(By.id("month")));
	 month.selectByIndex(6);
	 Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1999");
 		WebElement checkbox = driver.findElement(By.xpath("//input [@value='2']"));
 		checkbox.click();
 		  driver.findElement(By.name("websubmit")).click();
		
		String record=driver.getCurrentUrl();
		System.out.println(record);
		 
		
		
		
		
		
		
			}

}
