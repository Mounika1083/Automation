package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Selenium//updated//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dezlearn.com/testingpage/");
		driver.switchTo().frame("register-iframe");
		driver.findElement(By.className("search-field")).sendKeys("facebook");
		driver.findElement(By.className("search-submit")).click();

	}

}
