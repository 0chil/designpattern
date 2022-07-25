package decorator.example.beverage;

public abstract class Beverage {

	String description = "음료";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
