package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {


	//data member declaration
		
		@FindBy(id="userid")private WebElement userName;
		@FindBy(id="password")private WebElement password;
		@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
		
		//constructor
		
		public KiteLoginPage(WebDriver driver)
		{
			PageFactory.initElements( driver,this);
		}
		
		//methods
		
		public void senduserName()
		{
			userName.sendKeys("ELR321");
		}
		public void sendpassword()
		{
			password.sendKeys("Dhana1111");
		}
		public void clickonloginButton()
		{
		loginbutton.click();
		}
		
		
		

	
}



