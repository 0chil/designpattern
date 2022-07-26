package decorator.example.beverage;

public abstract class Beverage {

	public enum Size {TALL, GRANDE, VENTI}

	final Size size;
	String description = "음료";

	public Beverage(Size size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public Size getSize() {
		return size;
	}

	public abstract double cost();
}
