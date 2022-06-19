package creational.factorymethod.example.product.cake;

public class CheeseCake extends Cake {

	private static final String NAME = "Cheese Cake";
	private static final String TASTE = "a creamy bite";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String taste() {
		return TASTE;
	}
}
