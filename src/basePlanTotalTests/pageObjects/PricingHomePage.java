package basePlanTotalTests.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PricingHomePage {
	
	private final String LOGIN_URL = "https://getbase.com/pricing/";

	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="Log In") WebElement logInLink;
	
	public PricingHomePage(WebDriver driver){
		this.driver = driver;
		driver.get(LOGIN_URL);
	}

	public void gotoLogIn() {
		logInLink.click();
	}	


}
