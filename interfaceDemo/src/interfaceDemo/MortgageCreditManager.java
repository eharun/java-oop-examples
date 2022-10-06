package interfaceDemo;

public class MortgageCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Mortgage credit has been calculated.");
		
	}

}
