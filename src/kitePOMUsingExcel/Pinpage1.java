package kitePOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinpage1 {
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement continuebutton;
	
	public Pinpage1 (WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void sendpin(String Pin)
	{
		pin.sendKeys(Pin);
	}
	public void continuebutton()
	{
		continuebutton.click();
	}
	


}
