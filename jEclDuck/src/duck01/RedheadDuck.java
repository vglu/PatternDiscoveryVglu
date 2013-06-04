package duck01;

public class RedheadDuck extends DuckBaseClass {

	/* (non-Javadoc)
	 * @see duck01.DuckBaseClass#duckClassName()
	 */
	@Override
	public String duckClassName() {
		// TODO Auto-generated method stub
		return "RedheadDuck";
	}

	/* (non-Javadoc)
	 * @see duck01.DuckBaseClass#display()
	 */
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return this.duckClassName() + " My HEAD is RED!";
	}

}
