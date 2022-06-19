package creational.factorymethod.example;

import creational.factorymethod.example.cafe.Cafe;
import creational.factorymethod.example.cafe.SCafe;
import creational.factorymethod.example.cafe.TwosomeCafe;
import creational.factorymethod.example.product.Product;

public class Application {

	public static void main(String[] args) {
		Cafe cafe = new SCafe();
		cafe.printMenu();
		Product product = cafe.placeOrder();
		printProduct(product);

		Cafe cafe2 = new TwosomeCafe();
		cafe2.printMenu();
		Product product2 = cafe2.placeOrder();
		printProduct(product2);
	}

	private static void printProduct(Product product) {
		System.out.println("product.getName() = " + product.getName());
		System.out.println("product.getType() = " + product.getType());
		System.out.println("product.isLiquid() = " + product.isLiquid());
		System.out.println("product.taste() = " + product.taste());
	}
}
