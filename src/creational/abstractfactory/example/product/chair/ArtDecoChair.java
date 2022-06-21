package creational.abstractfactory.example.product.chair;

public class ArtDecoChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("sat on ArtDeco Chair");
	}

	@Override
	public int countLegs() {
		return 4;
	}
}
