package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutpage {
	
	@FindBy(id ="first-name")
	WebElement firstname;
	
	@FindBy(id ="last-name")
	WebElement lasttname;

	@FindBy(id ="postal-code")
	WebElement zipcode;
	
	@FindBy(id ="continue")
	WebElement contbtn;
	
	@FindBy(id ="finish")
	WebElement finish;	
	
	public CheckOutpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void enterValue (String strFn, String strln, String strZc) {
	firstname.sendKeys(strFn);
	lasttname.sendKeys(strln);
	zipcode.sendKeys(strZc);
	contbtn.click();
	finish.click();
	}
}

