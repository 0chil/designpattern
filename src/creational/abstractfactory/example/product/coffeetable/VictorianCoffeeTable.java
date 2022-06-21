package creational.abstractfactory.example.product.coffeetable;

public class VictorianCoffeeTable implements CoffeeTable {

	@Override
	public void putOn(Object obj) {
		System.out.println("put " + obj + "on Victorian coffee table");
	}

	@Override
	public int countLegs() {
		return 4;
	}
}
