package decorator.example.decorator;

import decorator.example.beverage.Beverage;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}
}
