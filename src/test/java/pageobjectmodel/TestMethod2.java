package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMethod2 {
	
	WebDriver driver;
	
	@BeforeClass
	void preset()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void login() throws InterruptedException
	{
		TestProject2 tp2 = new TestProject2(driver);
		Thread.sleep(2000);
		tp2.fillUN("Admin");
		Thread.sleep(2000);
		tp2.fillPW("admin123");
		Thread.sleep(2000);
		tp2.pressLoginButton();
		Thread.sleep(2000);		
	}
	
	@AfterClass
	void close()
	{
		driver.quit();
	}

}
