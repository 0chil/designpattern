package decorator.example;

import decorator.example.beverage.Beverage;
import decorator.example.beverage.DarkRoast;
import decorator.example.beverage.Espresso;
import decorator.example.beverage.HouseBlend;
import decorator.example.decorator.Mocha;
import decorator.example.decorator.NoConstructorDeco;
import decorator.example.decorator.Soy;
import decorator.example.decorator.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso(Beverage.Size.TALL);
		beverage = new Whip(beverage);
		printBeverage(beverage);

		Beverage beverageCompare = new Espresso(Beverage.Size.GRANDE);
		beverageCompare = new Whip(beverageCompare);
		printBeverage(beverageCompare);

		Beverage beverageCompare2 = new Espresso(Beverage.Size.VENTI);
		beverageCompare2 = new Whip(beverageCompare2);
		printBeverage(beverageCompare2);

		Beverage beverage2 = new DarkRoast(Beverage.Size.VENTI);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		printBeverage(beverage2);

		Beverage beverage3 = new HouseBlend(Beverage.Size.GRANDE);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		beverage3 = new NoConstructorDeco(beverage3);
		printBeverage(beverage3);

		Beverage beverage3Compare = new HouseBlend(Beverage.Size.VENTI);
		beverage3Compare = new Soy(beverage3Compare);
		beverage3Compare = new Mocha(beverage3Compare);
		beverage3Compare = new Whip(beverage3Compare);
		beverage3Compare = new NoConstructorDeco(beverage3Compare);
		printBeverage(beverage3Compare);
	}

	private static void printBeverage(Beverage beverage) {
		System.out.println(beverage.getSize().name() + ": " + beverage.getDescription() + " $" + beverage.cost());
	}
}
