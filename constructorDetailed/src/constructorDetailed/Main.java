package constructorDetailed;

public class Main {

	public static void main(String[] args) {

		// I use constructor for the firstProduct.

		Product firstProduct = new Product(1, "First product name", "First detailed product description", 2500, 50);
		System.out.println(firstProduct.getProductName());

		Product secondProduct = new Product();
		secondProduct.setProductId(2);
		secondProduct.setProductName("Second product name");
		secondProduct.setProductDescription("Second detailed product description");
		secondProduct.setProductPrice(5000);
		secondProduct.setProductStockAmount(100);
		System.out.println(secondProduct.getProductName());
	}

}
