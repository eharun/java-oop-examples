package overriding;

public class BaseCreditManager {
	// If we want to prevent method overriding, we have to use final keyword before double.
	public double calculate(double amount) {
		return amount * 1.18;
	}
}
