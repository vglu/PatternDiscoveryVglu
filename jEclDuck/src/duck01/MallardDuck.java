package duck01;

public class MallardDuck extends DuckBaseClass {

	/* (non-Javadoc)
	 * @see duck01.DuckBaseClass#duckClassName()
	 */
	@Override
	public String duckClassName() {
		return "MallardDuck";
	}

	/* (non-Javadoc)
	 * @see duck01.DuckBaseClass#display()
	 */
	@Override
	public String display() {
		
		return this.duckClassName() + " My body is EXELENT!";
	}

    @Override
    public int weigth() {
        return 3;    //To change body of overridden methods use File | Settings | File Templates.
    }


}
