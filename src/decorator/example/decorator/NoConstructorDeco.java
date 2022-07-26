package decorator.example.decorator;

import decorator.example.beverage.Beverage;

public class NoConstructorDeco extends CondimentDecorator {

	// 생성자가 없고, Beverage 초기화를 못해서 NPE를 뿜는 데코레이터였다.
	// 그러나 부모 추상 클래스에 생성자를 만들어서 꼭 생성자를 가지게 되었다.

	public NoConstructorDeco(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL)
			cost += 0.99;
		if (beverage.getSize() == Size.GRANDE)
			cost += 0.999;
		if (beverage.getSize() == Size.VENTI)
			cost += 0.9999;
		return cost;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모름";
	}
}
