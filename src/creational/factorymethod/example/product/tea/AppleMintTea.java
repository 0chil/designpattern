package creational.factorymethod.example.product.tea;

public class AppleMintTea extends Tea {

	private static final String NAME = "Apple Mint Tea";
	private static final String TASTE = "a fragrant, chilling sip";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String taste() {
		return TASTE;
	}
}
