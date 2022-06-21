package creational.abstractfactory.example.factory;

import creational.abstractfactory.example.product.chair.ArtDecoChair;
import creational.abstractfactory.example.product.chair.Chair;
import creational.abstractfactory.example.product.coffeetable.ArtDecoCoffeeTable;
import creational.abstractfactory.example.product.coffeetable.CoffeeTable;
import creational.abstractfactory.example.product.sofa.ArtDecoSofa;
import creational.abstractfactory.example.product.sofa.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ArtDecoCoffeeTable();
	}
}
