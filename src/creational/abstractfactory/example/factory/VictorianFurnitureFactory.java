package creational.abstractfactory.example.factory;

import creational.abstractfactory.example.product.chair.Chair;
import creational.abstractfactory.example.product.chair.VictorianChair;
import creational.abstractfactory.example.product.coffeetable.CoffeeTable;
import creational.abstractfactory.example.product.coffeetable.VictorianCoffeeTable;
import creational.abstractfactory.example.product.sofa.Sofa;
import creational.abstractfactory.example.product.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new VictorianCoffeeTable();
	}
}
