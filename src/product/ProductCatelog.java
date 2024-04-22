package product;

import java.util.ArrayList;
import java.util.List;

public class ProductCatelog {
	private List<Product> products;
	//initializing the List of products to store products
	public ProductCatelog() {
		products = new ArrayList<Product>();
	}
	
	//adding the list of products into list
	public void addProduct(Product product) {
		products.add(product);
	}
	
	//to search the required data and display the product based on search
	public List<Product> getResult(String search){
		//to store search result
		List<Product> result = new ArrayList<Product>();
		for(Product product : products ) {
			if(product.getName().equalsIgnoreCase(search)|| product.getCategory().equalsIgnoreCase(search)
					) {
				result.add(product);
			}
//			if(product.getPrice()==Double.parseDouble(search)) {
//				result.add(product);
//			}
		}
		return result;
		
	}
	
	
	

}
