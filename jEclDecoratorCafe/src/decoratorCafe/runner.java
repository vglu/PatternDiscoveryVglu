package decoratorCafe;

import decoratorCafe.CondimentDecorator.BeverageSize;

public class runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		System.out.println("========================================");
		Beverage	beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		System.out.println("========================================");
		Beverage	beverage3 = new HouseBlend();
		Soy			soy;
		soy = new Soy(beverage3);
		soy.setSize(BeverageSize.Small);
		beverage3 = new Mocha(soy);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		System.out.println("========================================");
		
	}

}
