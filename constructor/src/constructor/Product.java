package constructor;

public class Product {

	public Product (int id, String name, String description, double price, int stockAmount, String color) {
		
		System.out.println("Constructor has worked.");
		
		_id = id;
		_name = name;
		_description = description;
		_price = price;
		_stockAmount = stockAmount;
		_color = color;
		
	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _color;
	private String _code;
	
	public int get_id() {
		return _id;
	}
	
	public void set_id(int id) {
		_id = id; // this.id means id which is in the current class. Using _id instead of this.id is a best practice.
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String get_color() {
		return _color;
	}

	public void set_color(String _color) {
		this._color = _color;
	}

	public String get_code() {
		return this._name.substring(0,1) + _id;
	}
	
}
