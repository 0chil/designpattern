package creational.factorymethod.example.product.coffee;

public class Black extends Coffee {
	private static final String NAME = "Black";
	private static final String TASTE = "a bitter sip";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String taste() {
		return TASTE;
	}
}
