package decorator.example.decorator;

import decorator.example.beverage.Beverage;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}
}
