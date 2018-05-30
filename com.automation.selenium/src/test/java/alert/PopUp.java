package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
      public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C://Selenium//updated//chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("http://www.dezlearn.com/testingpage/");
  		driver.findElement(By.xpath("//*[@id=\"panel-197-0-0-1\"]/div/div/p[2]/button")).click();
  		Thread.sleep(2000);
  		Alert alert=driver.switchTo().alert();
  		alert.accept();
	}
}
