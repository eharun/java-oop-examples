package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}
	
	public static void findNumber() {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int numberToFind = 6;
		boolean isOk = false;
		
		for (int number : numbers) {
			if(number == numberToFind) {
				isOk = true;
				break;
			}
		}
		
		String message = "";
		if(isOk) {
			message = "The array contains " + numberToFind + ".";
			showMessage(message);
		} else {
			showMessage("The array does not contains " + numberToFind + ".");
		}
	}
	
	public static void showMessage(String message) {
		System.out.println(message);
	}

}
