package duck01;

import java.util.*;

public class Pond {

	ArrayList<DuckBaseClass> ducks = new ArrayList<DuckBaseClass>();
	enum Action {Quack, Swim, Display, Fly};
	
	public void addDuck(DuckBaseClass _duck)
	{
		ducks.add(_duck);
	}
	
	public void doSomething(Action _action)
	{
		Iterator<DuckBaseClass> it = ducks.iterator();
		int						i  = 0;
		String 					ret;
		System.out.println("************ -=" + _action + " =- **************");
		while (it.hasNext())
		{
			i++;
			ret = "Duck " + Integer.toString(i) + " from " + Integer.toString(ducks.size()) + " say = ";
			switch (_action)
			{
				case Display:
					System.out.println(ret + it.next().display());
					break;
				case Quack:
					System.out.println(ret + it.next().performQuackBehavior());
					break;
				case Swim:
					System.out.println(ret + it.next().swim());
					break;
				case Fly:
					System.out.println(ret + it.next().performFlyBehavior());
					break;
				default:
					System.out.println(ret + it.next().duckClassName() + " UNKNOUN ACTION!");
					break;
			}
		}
		System.out.println("All done");
	}
	
}
