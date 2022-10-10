package constructorDetailed;

public class Product {

	// This usage is an example of overloading.

	public Product(int productId, String productName, String productDescription, double productPrice,
			int productStockAmount) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productStockAmount = productStockAmount;
	}

	public Product() {

	}

	private int productId;
	private String productName;
	private String productDescription;
	private double productPrice;
	private int productStockAmount;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStockAmount() {
		return productStockAmount;
	}

	public void setProductStockAmount(int productStockAmount) {
		this.productStockAmount = productStockAmount;
	}

}
