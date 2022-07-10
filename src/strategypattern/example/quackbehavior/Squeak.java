package strategypattern.example.quackbehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("삑! (꽥 아님 ㅎ)");
	}
}
