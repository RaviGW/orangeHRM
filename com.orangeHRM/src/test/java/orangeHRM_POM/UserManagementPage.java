package orangeHRM_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserManagementPage 
{
	@FindBy (xpath="//a[@id='menu_admin_viewAdminModule']")
	private WebElement adminButton;
	
	@FindBy (xpath="//a[@id='menu_admin_UserManagement']")
	private WebElement userManagementButton;
	
	@FindBy (xpath="//input[@id='searchSystemUser_userName']")
	private WebElement usernameField;
	
	@FindBy (xpath="//select[@id='searchSystemUser_userType']")
	private WebElement userRoleDrpDwn;
	
	@FindBy (xpath="//input[@id='searchSystemUser_employeeName_empName']")
	private WebElement employeeNameField;
	
	@FindBy (xpath="//select[@id='searchSystemUser_status']")
	private WebElement statusDrpDwn;
	
	@FindBy (xpath="//input[@id='searchBtn']")
	private WebElement searchButton;
	
	@FindBy (xpath="//input[@id='resetBtn']")
	private WebElement resetButton;
	
	public UserManagementPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnAdminButton()
	{
		adminButton.click();
	}
	
	public void clickOnUserManagementButton()
	{
		userManagementButton.click();
	}
	
	public void enterUserName()
	{
		usernameField.sendKeys("Admin");
	}
	
	public void selectUserRole()
	{
		Select s = new Select(userRoleDrpDwn);	
		s.selectByVisibleText("Admin");
	}
	
	public void enterEmployeeName()
	{
		employeeNameField.sendKeys("Paul Collings");
	}
	
	public void selectStatus()
	{
		Select s= new Select(statusDrpDwn);
		s.selectByVisibleText("Enabled");
	}
	
	public void clickOnSearch()
	{
		searchButton.click();
	}
	
	public void clickOnReset()
	{
		resetButton.click();
	}
}

