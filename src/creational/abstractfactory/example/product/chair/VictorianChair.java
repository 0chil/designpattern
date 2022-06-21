package creational.abstractfactory.example.product.chair;

public class VictorianChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("sat on Victorian Chair");
	}

	@Override
	public int countLegs() {
		return 4;
	}
}
