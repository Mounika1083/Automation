package radioAndCheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//updated//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("python")).click();
        driver.findElement(By.id("code")).click();
        Thread.sleep(2000);
        driver.close();
	}

}
