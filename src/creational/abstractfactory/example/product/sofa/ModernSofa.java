package creational.abstractfactory.example.product.sofa;

public class ModernSofa implements Sofa {

	@Override
	public void sit() {
		System.out.println("sat on a Modern sofa");
	}

	@Override
	public int countLegs() {
		return 4;
	}
}
