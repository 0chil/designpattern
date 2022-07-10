package strategypattern.example;

import strategypattern.example.flybehavior.FlyRocketPowered;

public class DuckApplication {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck modelDuck = new ModelDuck();
		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}
