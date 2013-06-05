package decoratorCafe;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage _beverage) {
		this.beverage = _beverage;
	}
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + this.beverage.cost();
	}

}
