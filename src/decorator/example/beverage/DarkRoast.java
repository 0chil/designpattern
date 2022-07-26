package decorator.example.beverage;

public class DarkRoast extends Beverage {

	public DarkRoast(Size size) {
		super(size);
		description = "다크 로스트 커피";
	}

	@Override
	public double cost() {
		return 0.99;
	}
}
