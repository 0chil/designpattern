package decorator.example.decorator;

import decorator.example.beverage.Beverage;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL)
			cost += 0.10;
		if (beverage.getSize() == Size.GRANDE)
			cost += 0.15;
		if (beverage.getSize() == Size.VENTI)
			cost += 0.20;
		return cost;
	}
}
