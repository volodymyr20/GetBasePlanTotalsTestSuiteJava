package basePlanTotalTests.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
    private final String USER_EMAIL_ID = "user_email";
    private final String USER_PASSWORD_ID = "user_password";
    private final String LOGIN_BUTTON_ID = "button";
    
    private final String USER_NAME = "volodymyrbekesha@gmail.com";
    private final String USER_PASSWORD = "volo20dymyr";
	
	WebDriver driver;
	
	@FindBy(how=How.ID, using = USER_EMAIL_ID) WebElement email;
	@FindBy(how=How.ID, using = USER_PASSWORD_ID) WebElement password;
	@FindBy(how=How.TAG_NAME, using = LOGIN_BUTTON_ID) WebElement submit;
    	
	public LoginPage LogIn(){
		email.sendKeys(USER_NAME);
		password.sendKeys(USER_PASSWORD);
		submit.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
