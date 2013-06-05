package decoratorCafe;

public abstract class CondimentDecorator extends Beverage {
	enum BeverageSize  {Big, Medium, Small};
	public abstract String getDescription();
	private BeverageSize size = BeverageSize.Medium;
	public void setSize(BeverageSize _size) {
		this.size = _size;
	}
	
	public BeverageSize getSize() {
		return this.size;
	}
	
}
