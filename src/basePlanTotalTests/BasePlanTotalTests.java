// This is the main test suite, please refer to README.md for more details

package basePlanTotalTests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

// test suite specific modules

import basePlanTotalTests.constants.*; // those are constants like plan type & name used by more then one module
import basePlanTotalTests.utils.*; // test case result evaluation and logging utility
import basePlanTotalTests.pageObjects.*; // Page Objects

public class BasePlanTotalTests {

	public static void main(String[] args) {	
		
	    final String STARTER_MONTHLY_TOTAL_SUM="25";
	    // ...
	    // the rest of totals should be added for other test cases
	    
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TestCaseExecution testCaseExecution = new TestCaseExecution();	    
	  
	    // prerequisites for all test cases: 1) open pricing home page 2) log in
				
		PricingHomePage pricingHomePage = PageFactory.initElements(driver, PricingHomePage.class);
		pricingHomePage.gotoLogIn();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.LogIn();
		
		PlanTypeSelectionPage planTypeSelectionPage = PageFactory.initElements(driver, PlanTypeSelectionPage.class);

	    // test case #1: checking Starter + Monthly combination total sum
	    
		planTypeSelectionPage.ChoosePlanType(Constants.STARTER_PLAN_TYPE);
		planTypeSelectionPage.ChoosePlanTimePeriod(Constants.MONTHLY_PLAN_TIME_PERIOD);		
		
		testCaseExecution.EvaluateResult("Test case #1: checking Starter + Monthly combination total sum", 
				STARTER_MONTHLY_TOTAL_SUM, planTypeSelectionPage.TotalSum());
	
	    //test case post action: go back to the plan type selection form

		driver.navigate().back();
		driver.navigate().forward();
		
	    // test case #2: checking Starter + Annually combination total sum, the same pattern as above, just different values
	    // ...
	    // test case #9: checking Enterprise + Every Two Years combination total sum   
		// ...

		// test case suite post action
		
		driver.quit();
		
	}

}
