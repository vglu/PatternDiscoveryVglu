package duck01;

import duck01.Pond.Action;

public class runner {


	public static void main(String[] args) {

		Pond pond = new Pond();
		pond.addDuck(new DuckBaseClass());
		pond.addDuck(new MallardDuck());
		pond.addDuck(new RedheadDuck());
		pond.addDuck(new RiberDuck());
		pond.addDuck(new TreeDuck());
        pond.addDuck(new TurkeyAdapter(new WildTurkey()));
		
		pond.doSomething(Action.Display);
		System.out.println("========================");
		pond.doSomething(Action.Quack);
		System.out.println("========================");
		pond.doSomething(Action.Swim);
		System.out.println("========================");
		pond.doSomething(Action.Fly);
		System.out.println("========================");
	}

}
