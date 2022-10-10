package overriding;

public class CarCreditManager extends BaseCreditManager {
	// Overriding.
	public double calculate(double amount) {
		return amount * 1.08;
	}
}
