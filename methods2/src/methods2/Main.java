package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is so nice today.";
		String newMessage = message.substring(0,2); // We found first two character of the String.
		String city = giveCity();
		int number = add2(15,7);
		int add = add3(2,3,4,5,6,7,8);
		
		System.out.println(newMessage);
		System.out.println(city);
		System.out.println(number);
		System.out.println(add);

	}
	
	// Void specifies that a method does not return any type.

	public static void add() {
		System.out.println("Add");
	}

	public static void delete() {
		System.out.println("Delete");
	}

	public static void update() {
		System.out.println("Update");
	}
	
	public static int add2(int number1, int number2) {
		return number1 + number2;
	}
	
	// Working with variable arguments.
	
	public static int add3(int... numbers) {
		int total = 0;
		
		for (int number : numbers) {
			total += number;
		}
		
		return total;
	}
	
	public static String giveCity() {
		return "Ankara";
	}
}
