package strategypattern.example;

import strategypattern.example.flybehavior.FlyWithWings;
import strategypattern.example.quackbehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("응애 나는 맬러드덕");
	}
}
