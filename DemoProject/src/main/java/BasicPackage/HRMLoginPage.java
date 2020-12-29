package BasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLoginPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\EclipseWorkspace\\SeleniumRevision\\Drivers\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		if (driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		driver.close();
	}

}
