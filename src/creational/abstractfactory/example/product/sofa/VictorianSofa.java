package creational.abstractfactory.example.product.sofa;

public class VictorianSofa implements Sofa {

	@Override
	public void sit() {
		System.out.println("sat on a Victorian sofa");
	}

	@Override
	public int countLegs() {
		return 6;
	}
}
