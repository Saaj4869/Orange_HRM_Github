package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestProject2 {
	
	WebDriver driver;
	
	//constructor
	public TestProject2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username_textElement;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password_textElement;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit_buttonElement;

	public void fillUN(String username)
	{
		username_textElement.sendKeys(username);
	}
	
	public void fillPW(String password)
	{
		password_textElement.sendKeys(password);
	}
	
	public void pressLoginButton()
	{
		submit_buttonElement.click();
	}
	
}
