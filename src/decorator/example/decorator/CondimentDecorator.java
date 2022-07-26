package decorator.example.decorator;

import decorator.example.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		super(Size.TALL);
		this.beverage = beverage;
	}

	@Override
	public Size getSize() {
		return beverage.getSize();
	}

	public abstract String getDescription();
}
