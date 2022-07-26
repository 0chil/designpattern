package decorator.example.beverage;

public class HouseBlend extends Beverage {

	public HouseBlend(Size size) {
		super(size);
		description = "하우스 블렌드 커피";
	}

	@Override
	public double cost() {
		return 0.89;
	}
}
