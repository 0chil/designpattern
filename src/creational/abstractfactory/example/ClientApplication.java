package creational.abstractfactory.example;

import creational.abstractfactory.example.factory.ArtDecoFurnitureFactory;
import creational.abstractfactory.example.factory.ModernFurnitureFactory;
import creational.abstractfactory.example.factory.VictorianFurnitureFactory;
import creational.abstractfactory.example.product.chair.Chair;
import creational.abstractfactory.example.product.coffeetable.CoffeeTable;
import creational.abstractfactory.example.product.sofa.Sofa;

public class ClientApplication {

	private static final String SMARTPHONE = "a smartphone";

	public static void main(String[] args) {
		ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
		ArtDecoFurnitureFactory artDecoFurnitureFactory = new ArtDecoFurnitureFactory();
		VictorianFurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
		// TODO@0chil : Make Factories Singleton would be great

		Client client = new Client(modernFurnitureFactory);
		Chair chair = client.orderChair();
		Sofa sofa = client.orderSofa();
		CoffeeTable coffeeTable = client.orderCoffeeTable();

		chair.sitOn();
		sofa.sit();
		coffeeTable.putOn(SMARTPHONE);
	}
}
