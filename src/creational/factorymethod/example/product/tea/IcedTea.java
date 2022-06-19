package creational.factorymethod.example.product.tea;

public class IcedTea extends Tea {

	private static final String NAME = "Iced Tea";
	private static final String TASTE = "a sweet and sour sip";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String taste() {
		return TASTE;
	}
}
