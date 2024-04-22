package product;

public class Product {

	private String name;
	private String category;
	private String desription;
	private double price;
	//default constructor
	public Product() {
		super();
	}
	//Parameterized constructor
	public Product(String name, String category, String desription, double price) {
		super();
		this.name = name;
		this.category = category;
		this.desription = desription;
		this.price = price;
	}
	//setter and getter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDesription() {
		return desription;
	}
	public void setDesription(String desription) {
		this.desription = desription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", desription=" + desription + ", price=" + price
				+ "]";
	}
	
	
}
