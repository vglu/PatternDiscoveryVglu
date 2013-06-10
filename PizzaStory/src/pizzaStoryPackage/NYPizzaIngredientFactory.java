package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 06.06.13
 * Time: 17:38
 * To change this template use File | Settings | File Templates.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.println("ADD ThickCrustDough");
        return new ThickCrustDough();
    }



    @Override
    public Sauce createSauce() {
        System.out.println("ADD MarinaraSauce");
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("ADD ReggianoCheese");
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        System.out.println("ADD Garlic Onion Mushroom RedPepper");
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("ADD SlicedPepperoni");
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        System.out.println("ADD createClam");
        return new FreshClams();
    }
}
