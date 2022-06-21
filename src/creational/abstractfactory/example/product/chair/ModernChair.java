package creational.abstractfactory.example.product.chair;

public class ModernChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("sat on Modern Chair");
	}

	@Override
	public int countLegs() {
		return 4;
	}
}
