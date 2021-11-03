package application2;

import java.util.Locale;
import java.util.Scanner;

import entities2.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data: ");
		System.out.printf("Name:");
		String name = sc.nextLine();
		
		System.out.printf("Price: ");
		Double price = sc.nextDouble();
		Product product = new Product(name, price);

		product.setName("Computador");
		System.out.println("Update name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());

		System.out.println();
		System.out.println("Product data: " + product);
		//System.out.println(product.name + "," + product.price + "," + product.quantity);
		
		System.out.println();
		System.out.printf("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.printf("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.printf("Updated data: " + product);
		
		sc.close();

	}

}
