package duck01;

public class DuckBaseClass implements Duck, Comparable{

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

    @Override
    public int weigth() {
        return 0;
    }


    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck)o;
        if (this.weigth() < otherDuck.weigth()) {
            return -1;
        } else if (this.weigth() == otherDuck.weigth()) {
            return 0;
        }
        return 1;


    }
}
