package duck01;

public class TreeDuck extends DuckBaseClass 
{

	/* (non-Javadoc)
	 * @see duck01.DuckBaseClass#display()
	 */
	@Override
	public String display() {
		
		return "BIG TREE DUCK! ";
	}

	/* (non-Javadoc)
	 * @see duck01.DuckBaseClass#duckClassName()
	 */
	@Override
	public String duckClassName() {
		// TODO Auto-generated method stub
		return "TreeDuck";
	}
	
	public TreeDuck()
	{
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MuteQuack();
	}
	
}
