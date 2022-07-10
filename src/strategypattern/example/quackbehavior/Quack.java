package strategypattern.example.quackbehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("꽥! (죽은거 아님?)");
	}
}
