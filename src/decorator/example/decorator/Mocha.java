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
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL)
			cost += 0.20;
		if (beverage.getSize() == Size.GRANDE)
			cost += 0.25;
		if (beverage.getSize() == Size.VENTI)
			cost += 0.30;
		return cost;
	}
}
