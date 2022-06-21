package creational.abstractfactory.example.product.sofa;

public class ArtDecoSofa implements Sofa {

	@Override
	public void sit() {
		System.out.println("sat on a Art-Deco sofa");
	}

	@Override
	public int countLegs() {
		return 6;
	}
}
