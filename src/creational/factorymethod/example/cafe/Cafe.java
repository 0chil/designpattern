package creational.factorymethod.example.cafe;

import creational.factorymethod.example.product.Product;

public abstract class Cafe {

	public abstract void printMenu();

	public abstract Product placeOrder();
}
