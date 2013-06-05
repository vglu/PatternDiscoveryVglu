package decoratorCafe;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	public Soy(Beverage _beverage) {
		this.beverage = _beverage;
	}
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Soy " + "size: " + this.getSize();
	}

	@Override
	public double cost() {
		double	coast = this.beverage.cost();
		switch (this.getSize()) {
			case Big:
				coast += 0.20;	
				break;
			case Medium:
				coast += 0.15;
				break;
			case Small:
				coast += 0.10;
				break;
			default:
				break;
		}
		return coast;
	}

}
