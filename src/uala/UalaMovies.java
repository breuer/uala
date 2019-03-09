package uala;

import java.util.ArrayList;
import java.util.List;

public class UalaMovies {

	private List<Product> products;
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getRecomendations(User user){
		
		List<Product> recomendations = new ArrayList<Product>();
		switch (user.getState()) {
		case HAPPY:
			for(Product product : products) {
				if(product instanceof Movie) {
					recomendations.add(product);
					break;
				}
			}
			break;
		case MELANCHOLIC:
			for(Product product : products) {
				if(product.moreThan(10)) {
					recomendations.add(product);
				}
			}
			break;
		case SAD:
			for(Product product : products) {
				if(product.getDurationMinutes() > 120) {
					recomendations.add(product);
				}
			}
			break;

		default:
			break;
		}
		return recomendations;
	}
	
	
}
