package dropDowns;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {	
	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//updated//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//*[@id=\"menu1\"]")).click();
		List<WebElement> listOfElements=driver.findElements(By.xpath("//*[@class='dropdown-menu']//li"));
		int sizeOfDropDowns=listOfElements.size();		
		for(int i=0;i<sizeOfDropDowns;i++) {
			WebElement element=listOfElements.get(i);
			String text=element.getAttribute("innerText");
			System.out.println(text);
			if(text.equals("HTML"))
			{
				element.click();				
				break;
			}
		}
		driver.close();
	}
}
