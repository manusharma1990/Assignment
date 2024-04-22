package product;


public class Result {

	public static void main(String[] args) {
		ProductCatelog catelog = new ProductCatelog();
		//adding list of products into the catalog for accessing searched product
		catelog.addProduct(new Product("Smartphone", "electronic", "screen touch mobile", 10000));
		catelog.addProduct(new Product("Laptop", "electronic", "portable and performance oriented laptop with longlasting battery", 80000));
		catelog.addProduct(new Product("Fridge", "electronic", "low power consumption and affordable.", 20000));
		catelog.addProduct(new Product("Clothing", "fashion", "Comfort and elastic", 1999));
		catelog.addProduct(new Product("Jewellery", "accessories", "fashionable, affordable, leight weight", 299));
		//searching result 1
		String search = "smartphone";
		System.out.println(catelog.getResult(search)); 
		
	}

}
