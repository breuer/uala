package uala;

import java.util.List;

public class User {

	private UserState state;
	private List<Channel> channels;
	
	public List<Channel> getChannels() {
		return channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

	public UserState getState() {
		return state;
	}

	public void setState(UserState state) {
		this.state = state;
	}

	private List<Product> viewedProducts;

	public List<Product> getViewedProducts() {
		return viewedProducts;
	}

	public void setViewedProducts(List<Product> viewedProducts) {
		this.viewedProducts = viewedProducts;
	}
	
	public boolean isOld() {
		for(Product product : viewedProducts) {
			if(!product.isOld()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean seeSomethingInteresting() {
		for(Product product : viewedProducts) {
			if(product.isInteresting()) {
				return true;
			}
		}
		return false;
	}
}
