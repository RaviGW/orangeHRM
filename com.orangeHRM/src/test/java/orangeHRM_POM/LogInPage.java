package orangeHRM_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	@FindBy (xpath="//input[@id='txtUsername']")
	private WebElement usernameField;
	
	@FindBy (xpath="//input[@id='txtPassword']")
	private WebElement passwordField;
	
	@FindBy (xpath="//input[@id='btnLogin']")
	private WebElement loginButton;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterCredentials()
	{
		usernameField.sendKeys("Admin");
		passwordField.sendKeys("admin123");
		loginButton.click();
	}
}


