package basePlanTotalTests.utils;

public class TestCaseExecution {

	public void EvaluateResult(String TestCaseName, String Expected, String Actual){
		if (Expected.equals(Actual)){
			
			System.out.println(TestCaseName + ": PASS");
			
		} else {
			
			System.out.println(TestCaseName + ": FAIL");
			System.out.println("Expected: " + Expected);
			System.out.println("Actual: " + Actual);
		}		

	}
}
