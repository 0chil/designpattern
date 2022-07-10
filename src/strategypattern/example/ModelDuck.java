package strategypattern.example;

import strategypattern.example.flybehavior.FlyNoWay;
import strategypattern.example.quackbehavior.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("모형 오리인데용");
	}
}
