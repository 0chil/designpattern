package decorator.example.beverage;

public class Espresso extends Beverage {

	public Espresso(Size size) {
		super(size);
		description = "에스프레소";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
