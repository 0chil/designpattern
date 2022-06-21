package creational.abstractfactory.example.product.coffeetable;

public class ModernCoffeeTable implements CoffeeTable {

	@Override
	public void putOn(Object obj) {
		System.out.println("put "+ obj + "on Modern coffee table");
	}

	@Override
	public int countLegs() {
		return 4;
	}
}
