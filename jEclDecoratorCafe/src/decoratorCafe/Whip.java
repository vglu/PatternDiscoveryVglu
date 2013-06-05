package decoratorCafe;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	public Whip(Beverage _beverage) {
		this.beverage = _beverage;
	}
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .20 + this.beverage.cost();
	}
}
