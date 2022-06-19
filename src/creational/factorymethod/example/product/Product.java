package creational.factorymethod.example.product;

public abstract class Product {

	public abstract ProductType getType();

	public abstract String getName();

	public abstract String taste();

	public abstract Boolean isLiquid();
}
