package duck01;

public class RiberDuck extends DuckBaseClass {

	/* (non-Javadoc)
	 * @see duck01.DuckBaseClass#duckClassName()
	 */
	@Override
	public String duckClassName() {
		return "RiberDuck";
	}

	/* (non-Javadoc)
	 * @see duck01.DuckBaseClass#display()
	 */
	@Override
	public String display() {
		return this.duckClassName() + " I am loock like a toy";
	}

	/* (non-Javadoc)
	 * @see duck01.DuckBaseClass#quack()
	 */
/*	@Override
	public String quack() {
	
		return this.duckClassName() + " Peeep-Peep-Pep ...";
	}
*/
	public RiberDuck()
	{
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new SQuack();
	}
	
}
