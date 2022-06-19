package creational.factorymethod.example.product.tea;

import creational.factorymethod.example.product.Product;
import creational.factorymethod.example.product.ProductType;

public abstract class Tea extends Product {

	@Override
	public ProductType getType() {
		return ProductType.TEA;
	}

	@Override
	public Boolean isLiquid() {
		return false;
	}
}
