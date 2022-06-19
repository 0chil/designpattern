package creational.factorymethod.example.product.cake;

public class ChocolateCake extends Cake {

	private static final String NAME = "Chocolate Cake";
	private static final String TASTE = "a sweet bite";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String taste() {
		return TASTE;
	}
}
