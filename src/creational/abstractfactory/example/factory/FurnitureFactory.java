package creational.abstractfactory.example.factory;

import creational.abstractfactory.example.product.chair.Chair;
import creational.abstractfactory.example.product.coffeetable.CoffeeTable;
import creational.abstractfactory.example.product.sofa.Sofa;

public interface FurnitureFactory {

	Chair createChair();

	Sofa createSofa();

	CoffeeTable createCoffeeTable();
}
