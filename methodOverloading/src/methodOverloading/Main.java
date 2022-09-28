package methodOverloading;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.addition(3,5));
		System.out.println(calculator.addition(3,5,7));
		
	}

}
