package creational.factorymethod.example.cafe;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

import creational.factorymethod.example.product.Product;
import creational.factorymethod.example.product.cake.CheeseCake;
import creational.factorymethod.example.product.cake.ChocolateCake;
import creational.factorymethod.example.product.coffee.Black;
import creational.factorymethod.example.product.coffee.VanillaLatte;
import creational.factorymethod.example.product.tea.AppleMintTea;

public class TwosomeCafe extends Cafe {
	private static final String MENU_MESSAGE = "투X 메뉴입니다: ";
	private static final String REORDER_MESSAGE = "잘못된 메뉴입니다. 다시 주문해주세요!";

	private enum MenuType {
		BLACK_COFFEE("아메리카노"),
		VANILLA_LATTE("바닐라 라떼"),
		CHEESE_CAKE("치즈 케익"),
		CHOCOLATE_CAKE("초콜릿 케익"),
		APPLE_MINT_TEA("애플 민트 차");

		private final String name;

		MenuType(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	public TwosomeCafe() {
	}

	@Override
	public void printMenu() {
		System.out.println(MENU_MESSAGE);
		Arrays.stream(MenuType.values()).forEach(menuType -> System.out.println(menuType.getName()));
	}

	@Override
	public Product placeOrder() {
		System.out.println("주문하시겠습니까?: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		return selectProduct(input);
	}

	private Product selectProduct(String input) {
		Optional<MenuType> menu = Arrays.stream(MenuType.values())
			.filter(type -> type.getName().contains(input))
			.findFirst();

		if (menu.isPresent()) {
			return createProduct(menu.get());
		} else {
			System.out.println(REORDER_MESSAGE);
			return placeOrder();
		}
	}

	private Product createProduct(MenuType menuType) {
		switch (menuType) {
			case CHEESE_CAKE:
				return new CheeseCake();
			case BLACK_COFFEE:
				return new Black();
			case VANILLA_LATTE:
				return new VanillaLatte();
			case APPLE_MINT_TEA:
				return new AppleMintTea();
			case CHOCOLATE_CAKE:
				return new ChocolateCake();
			default:
				return null;
		}
	}
}