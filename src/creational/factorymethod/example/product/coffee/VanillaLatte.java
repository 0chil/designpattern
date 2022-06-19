package creational.factorymethod.example.product.coffee;

public class VanillaLatte extends Coffee {

	private static final String NAME = "Vanilla Latte";
	private static final String TASTE = "a bittersweet sip";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String taste() {
		return TASTE;
	}
}
