package creational.factorymethod.example.product.cake;

import creational.factorymethod.example.product.Product;
import creational.factorymethod.example.product.ProductType;

public abstract class Cake extends Product {

	@Override
	public ProductType getType() {
		return ProductType.CAKE;
	}

	@Override
	public Boolean isLiquid() {
		return false;
	}
}
