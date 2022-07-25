package decorator.example.decorator;

import decorator.example.beverage.Beverage;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}
}
