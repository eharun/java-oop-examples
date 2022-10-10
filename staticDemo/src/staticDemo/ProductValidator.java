package staticDemo;

public class ProductValidator {
	// We can use it with class name -ProductValidator- since the method is a static method.
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
