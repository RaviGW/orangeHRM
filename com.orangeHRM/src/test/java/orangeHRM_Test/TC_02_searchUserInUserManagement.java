package orangeHRM_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangeHRM_POM.LogInPage;
import orangeHRM_POM.UserManagementPage;
import orangeHRM_POM.logOut;

public class TC_02_searchUserInUserManagement 
{
	WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "B:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void launchApplication() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
	}
	
	@Test (dependsOnMethods = "loginInToOrangeHRM")
	public void toVerifyUserDataInUserManagement()
	{
		UserManagementPage user = new UserManagementPage(driver);
		user.clickOnAdminButton();
		user.clickOnUserManagementButton();
		user.enterUserName();
		user.selectUserRole();
		user.enterEmployeeName();
		user.selectStatus();
		user.clickOnSearch();
	}
	
	@Test 
	public void loginInToOrangeHRM()
	{
		LogInPage login = new LogInPage(driver);
		login.enterCredentials();
	}
	
	@AfterMethod
	public void testCaseStatus()
	{
		System.out.println("Test Case Passed");
	}
	
	@AfterClass
	public void closeApplication() throws InterruptedException
	{
		logOut logout = new logOut(driver);
		logout.logOutOfOrangeHRM();
		driver.close();
	}

}
