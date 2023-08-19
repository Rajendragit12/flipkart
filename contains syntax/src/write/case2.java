package write;

import org.openqa.selenium.By;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class case2 {

	public static void main(String[] args) {
	 
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rajendra");
		driver.findElement(By.name("lastname")).sendKeys("Sahoo");
		driver.findElement(By.name("reg_email__")).sendKeys("7978836107");
		driver.findElement(By.name("reg_passwd__")).sendKeys("rajraoxxx");
		 
		
		
		WebElement xxx= driver.findElement(By.id("day"));
		Select day=new Select(xxx);
		day.selectByValue("4");
		
		Select month= new Select(driver.findElement(By.id("month")));
		month.selectByIndex(10);
		
		Select year= new Select(driver.findElement(By.id("year")));
		year.selectByValue("1998");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		 

}
}
