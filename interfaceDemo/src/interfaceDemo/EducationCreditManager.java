package interfaceDemo;

public class EducationCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Education credit has been calculated.");
		
	}

}
