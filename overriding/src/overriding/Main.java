package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] creditManagers = new BaseCreditManager[] {new EducationCreditManager(), new MortgageCreditManager(), new CarCreditManager()};
		
		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.calculate(1000)); // Polymorphism.
		}
		
		/* EducationCreditManager educationCreditManager = new EducationCreditManager();
		System.out.println(educationCreditManager.calculate(1000)); */

	}

}
