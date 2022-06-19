package creational.factorymethod.example.cafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

import creational.factorymethod.example.product.Product;
import creational.factorymethod.example.product.cake.CheeseCake;
import creational.factorymethod.example.product.coffee.Black;
import creational.factorymethod.example.product.coffee.VanillaLatte;

public class SCafe extends Cafe {

	private static final String MENU_NOT_AVAILABLE = "지원하지 않는 메뉴입니다";
	private static final String MENU_MESSAGE = "You can order:";
	private static final String WELCOME_MESSAGE = "Good day! This is Automated Cafe S. You can order by identifiable name, case-insensitive.";
	private static final String ORDER_MESSAGE = "Type your order in: ";
	private final List<Class<? extends Product>> menus;

	public SCafe() {
		this.menus = List.of(VanillaLatte.class, Black.class, CheeseCake.class);
	}

	public void printMenu() {
		System.out.println(MENU_MESSAGE);
		menus.forEach(menu -> System.out.println(menu.getSimpleName()));
	}

	private Optional<Class<? extends Product>> getProductClass(String name) {
		return menus.stream().filter(menu -> menu.getCanonicalName().toLowerCase().contains(name)).findFirst();
	}

	@Override
	public Product placeOrder() {
		System.out.println(WELCOME_MESSAGE);
		System.out.println(ORDER_MESSAGE);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toLowerCase();

		Class<? extends Product> productClass = getProductClass(input).orElseThrow(
			() -> new NoSuchElementException(MENU_NOT_AVAILABLE));

		return createProduct(productClass);
	}

	private Product createProduct(Class<? extends Product> orderedClass) {
		Product productToServe;
		try {
			Constructor<? extends Product> constructor = orderedClass.getConstructor();
			productToServe = constructor.newInstance();
		} catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
				 IllegalAccessException e) {
			throw new RuntimeException(e);
		}
		return productToServe;
	}
}