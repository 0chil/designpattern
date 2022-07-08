package strategypattern.example;

import strategypattern.example.flybehavior.FlyBehavior;
import strategypattern.example.quackbehavior.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	/**
	 * 엥? 나는 private final 박고 생성자 주입 하고싶은데... 이거 완전 별로임
	 * 나중에 나오겠지?
	 */

	public Duck() {
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도요. 잘 바뀌지 않는 사항이네요.");
	}
}
