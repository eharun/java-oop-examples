package constructor;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product (1, "Laptop", "A new laptop.", 3000, 2, "Black");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.get_code());
		
	}

}
