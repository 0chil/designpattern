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
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL)
			cost += 0.15;
		if (beverage.getSize() == Size.GRANDE)
			cost += 0.20;
		if (beverage.getSize() == Size.VENTI)
			cost += 0.25;
		return cost;
	}
}
