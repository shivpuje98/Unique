package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KteLogin {

	
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
	
	//constructor
	
	public KteLogin(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	//methods
	
	public void senduserName( String username)
	{
		userName.sendKeys(username);
	}
	public void sendpassword(String passsword)
	{
		password.sendKeys(passsword);
	}
	public void clickonloginButton()
	{
		loginbutton.click();
	}
	

}
