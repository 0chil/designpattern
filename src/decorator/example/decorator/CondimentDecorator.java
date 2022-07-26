package decorator.example.decorator;

import decorator.example.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public abstract String getDescription();
}
