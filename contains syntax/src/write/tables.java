package write;

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
		 WebElement raj = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[1]"));
		 String exp,act;
		 exp="l-2-3";
		 act=raj.getText();
		 if(act.contains(exp))
		 {
			 System.out.println("f");
		 }else 
		 {
			 System.out.println("F");
		 }
		 
		System.out.println(act);
		
		
	}
	
}
