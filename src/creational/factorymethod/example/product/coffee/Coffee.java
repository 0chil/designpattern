package creational.factorymethod.example.product.coffee;

import creational.factorymethod.example.product.Product;
import creational.factorymethod.example.product.ProductType;

public abstract class Coffee extends Product {

	@Override
	public ProductType getType() {
		return ProductType.COFFEE;
	}

	@Override
	public Boolean isLiquid() {
		return true;
	}
}
