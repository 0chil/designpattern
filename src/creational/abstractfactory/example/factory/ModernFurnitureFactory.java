package creational.abstractfactory.example.factory;

import creational.abstractfactory.example.product.chair.Chair;
import creational.abstractfactory.example.product.chair.ModernChair;
import creational.abstractfactory.example.product.coffeetable.CoffeeTable;
import creational.abstractfactory.example.product.coffeetable.ModernCoffeeTable;
import creational.abstractfactory.example.product.sofa.ModernSofa;
import creational.abstractfactory.example.product.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ModernCoffeeTable();
	}
}
