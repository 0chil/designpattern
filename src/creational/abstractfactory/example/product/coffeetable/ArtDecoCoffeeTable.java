package creational.abstractfactory.example.product.coffeetable;

public class ArtDecoCoffeeTable implements CoffeeTable {

	@Override
	public void putOn(Object obj) {
		System.out.println("put "+ obj + "on Art-Deco coffee table");
	}

	@Override
	public int countLegs() {
		return 4;
	}
}
