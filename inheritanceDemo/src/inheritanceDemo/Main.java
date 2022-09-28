package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		CreditUI creditUI = new CreditUI();
		
		creditUI.calculateCredit(new EducationCreditManager());
		creditUI.calculateCredit(new PersonalFinanceCreditManager());

	}

}
