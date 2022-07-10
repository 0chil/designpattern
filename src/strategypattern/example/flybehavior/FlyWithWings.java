package strategypattern.example.flybehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날개를 파닥파닥! 날고 있어요");
	}
}
