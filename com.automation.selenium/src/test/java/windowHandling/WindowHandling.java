package windowHandling;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Selenium//updated//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent = driver.getWindowHandle();
		System.out.println("parent windows " + parent);
		System.out.println("Getting title of parent window " + driver.getTitle());
		driver.findElement(By.xpath("//*[text()=' Click this link to start new Tab ']")).click();
		Set<String> child = driver.getWindowHandles();
		int childWindows = child.size();
		System.out.println("all windows size " + childWindows);
		for (String window : child) {
			if (!parent.equalsIgnoreCase(window)) {
				driver.switchTo().window(window);
				System.out.println("Getting title of parent window " + driver.getTitle());
				driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("mounika");
				driver.close();
			}

		}
		driver.switchTo().window(parent);
		driver.close();

	}

}
