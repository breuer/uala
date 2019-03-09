package uala;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void list(List<Product> recomendations){
		for(Product product : recomendations) {
			System.out.println(product.getName());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		UalaMovies system = new UalaMovies();
		Product product01 = new Serie("friends", 1000, 6, "01/01/1995");
		Product product02 = new Serie("dark", 2000, 1, "01/01/2017");
		Product product03 = new Serie("true detective", 1500, 3, "01/01/2015");
		Product product04 = new Serie("game of thrones", 8000, 8, "01/01/2008");
		Product product05 = new Serie("south park", 20000, 20, "01/01/1998");
		
		Product product06 = new Movie("terminator", 90, "01/01/1984", 1);
		Product product07 = new Movie("alien", 120, "01/01/1979", 2);
		Product product08 = new Movie("it", 180, "01/01/1992", 0);
		Product product09 = new Movie("et", 80, "01/01/1982", 1);
		Product product010 = new Movie("rambo", 100, "01/01/1983", 0);
		
		Product product011 = new Documentary("free solo", 100, "01/01/2018");
		Product product012 = new Documentary("beatles", 500, "01/01/2010");
		Product product013 = new Documentary("pink floyd", 200, "01/01/1980");
		Product product014 = new Documentary("rolling stone", 100, "01/01/1967");
		Product product015 = new Documentary("the doors", 100, "01/01/2006");
		
		List<Product> products = new ArrayList<Product>();
		products.add(product01);
		products.add(product02);
		products.add(product03);
		products.add(product04);
		products.add(product05);
		products.add(product06);
		products.add(product07);
		products.add(product08);
		products.add(product09);
		products.add(product010);
		products.add(product011);
		products.add(product012);
		products.add(product013);
		products.add(product014);
		products.add(product015);
		
		system.setProducts(products);
		
		
		List<Product> productsUser01 = new ArrayList<Product>();
		productsUser01.add(product01);
		productsUser01.add(product06);
		productsUser01.add(product07);
		User user01 = new User();
		user01.setState(UserState.HAPPY);
		user01.setViewedProducts(productsUser01);
		
		List<Product> productsUser02 = new ArrayList<Product>();
		productsUser01.add(product03);
		productsUser01.add(product05);
		productsUser01.add(product07);
		productsUser01.add(product011);
		productsUser01.add(product012);
		User user02 = new User();
		user02.setState(UserState.MELANCHOLIC);
		user02.setViewedProducts(productsUser02);

		List<Product> productsUser03 = new ArrayList<Product>();
		productsUser01.add(product03);
		productsUser01.add(product08);
		productsUser01.add(product012);
		productsUser01.add(product014);
		productsUser01.add(product015);
		User user03 = new User();
		user03.setState(UserState.SAD);
		user03.setViewedProducts(productsUser03);

		
		//Saber si un cliente es un antiguo. Lo es cuando solo mira productos viejos.
		System.out.println("user01.isOld():" + user01.isOld());
		System.out.println("user02.isOld():" + user02.isOld());
		
		//Saber si un cliente mira algo interesante.
		System.out.println("user01.seeSomethingInteresting():" + user01.seeSomethingInteresting());
		System.out.println("user02.seeSomethingInteresting():" + user02.seeSomethingInteresting());
		
		//Poder pedirle recomendaciones al sistema.
		System.out.println("recomendations user01: ");
		list(system.getRecomendations(user01));
		System.out.println("recomendations user02: ");
		list(system.getRecomendations(user02));
		System.out.println("recomendations user03: ");
		list(system.getRecomendations(user03));
	}
	
}
