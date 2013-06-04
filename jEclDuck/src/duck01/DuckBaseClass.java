package duck01;

public class DuckBaseClass {

	IFlyBehavior	flyBehavior;
	IQuackBehavior	quackBehavior;
	
	public DuckBaseClass()
	{
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public String performQuackBehavior()
	{
		return "Duck " + this.duckClassName() + " " + quackBehavior.quack();
	}
	
	public String performFlyBehavior()
	{
		return "Duck " + this.duckClassName() + " " + flyBehavior.fly();
	}
	
	public String duckClassName()
	{
		return "Duck Base Class";
	}
	
	public String display()
	{
		return "Duck " + this.duckClassName() + " loock Great!";
	}
	
/*	public String quack()
	{
		return "Duck " + this.duckClassName() + " can Quack";
	}
*/	
	public String swim()
	{
		return "Duck " + this.duckClassName() + " can swim"; 
	}
	
/*	public String fly()
	{
		return "Enybody Duck " + this.duckClassName() + " can fly";
	}
*/	
}
