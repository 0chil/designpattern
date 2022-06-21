package creational.abstractfactory.example;

import creational.abstractfactory.example.factory.FurnitureFactory;
import creational.abstractfactory.example.product.chair.Chair;
import creational.abstractfactory.example.product.coffeetable.CoffeeTable;
import creational.abstractfactory.example.product.sofa.Sofa;

public class Client {

	private final FurnitureFactory factory;

	public Client(FurnitureFactory factory) {
		this.factory = factory;
	}

	public Chair orderChair() {
		return factory.createChair();
	}

	public Sofa orderSofa() {
		return factory.createSofa();
	}

	public CoffeeTable orderCoffeeTable() {
		return factory.createCoffeeTable();
	}
}
