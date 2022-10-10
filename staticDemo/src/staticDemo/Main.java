package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 5000;
		product.name = "";
		
		manager.add(product);
	}

}
