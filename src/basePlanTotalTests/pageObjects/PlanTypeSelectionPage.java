package basePlanTotalTests.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basePlanTotalTests.constants.*;

public class PlanTypeSelectionPage {

	private final String STARTER_PLAN_BTN_CSS="div[rel=\"Starter 2014\"]";
	private final String PROFESSIONAL_PLAN_BTN_CSS="div[rel=\"Professional 2014\"]";
	private final String ENTERPRISE_PLAN_BTN_CSS="div[rel=\"Enterprise 2014\"]";
    
	private final String MONTHLY_BTN_ID="period1";
	private final String ANNUALLY_BTN_ID="period2";
	private final String EVERY_TWO_YEARS_BTN_ID="period3";
    
	private final String TOTAL_SUM_CSS="span[class=\"current-sum\"]";
 
	WebDriver driver;    		
	
	@FindBy(how=How.CSS, using = STARTER_PLAN_BTN_CSS) WebElement StarterPlanBtn_loc;
	@FindBy(how=How.CSS, using = PROFESSIONAL_PLAN_BTN_CSS) WebElement ProfessionalPlanBtn_loc;
	@FindBy(how=How.CSS, using = ENTERPRISE_PLAN_BTN_CSS) WebElement EnterprisePlanBtn_loc;
	
	@FindBy(how=How.ID, using = MONTHLY_BTN_ID) WebElement MonthlyBtn_loc;
	@FindBy(how=How.ID, using = ANNUALLY_BTN_ID) WebElement AnnuallyBtn_loc;
	@FindBy(how=How.ID, using = EVERY_TWO_YEARS_BTN_ID) WebElement EveryTwoYearsBtn_loc;
	
	@FindBy(how=How.CSS, using = TOTAL_SUM_CSS) WebElement TotalSum_loc;
	  
    public void ChoosePlanType(String PlanType){
        if (PlanType == Constants.STARTER_PLAN_TYPE)    
        	StarterPlanBtn_loc.click();
        else if (PlanType == Constants.PROFESSIONAL_PLAN_TYPE) {
        	ProfessionalPlanBtn_loc.click();
        }
        else	 {
        	EnterprisePlanBtn_loc.click();
        }
    }   
        
    public void ChoosePlanTimePeriod(String PlanTimePeiod){
        if (PlanTimePeiod == Constants.MONTHLY_PLAN_TIME_PERIOD)    
        	MonthlyBtn_loc.click();
        else if (PlanTimePeiod == Constants.ANNUALY_PLAN_TIME_PERIOD) {
        	AnnuallyBtn_loc.click();
        }
        else	 {
        	EveryTwoYearsBtn_loc.click();
        }
    }         
    
    public String TotalSum(){
    	return TotalSum_loc.getText();
    }
}
