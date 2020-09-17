package pom_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_Package.Driver;
import utility.User_Credentials;

public class Login_Page_WebElements extends Driver {


	@FindBy(id="txtUsername")
	WebElement username;

	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login_button;


	public Login_Page_WebElements()
	{
		PageFactory.initElements(driver, this);
	}


	public void open_orange_hrm()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	public void username_textbox() throws Exception
	{
		username.sendKeys(User_Credentials.excel_username());
	}


	public void password_textbox() throws Exception
	{
		password.sendKeys(User_Credentials.excel_password());
	}
	
	public void click_login_button() throws InterruptedException
	{
		Thread.sleep(5000);
		login_button.click();
	}
}
