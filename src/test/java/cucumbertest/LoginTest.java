package cucumbertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		WebElement uName= driver.findElement(By.id("username"));
		uName.sendKeys("Jayakishore");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("login")).click();
	}

}
