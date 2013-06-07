package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 07.06.13
 * Time: 10:29
 * To change this template use File | Settings | File Templates.
 */
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Sauce createSauce() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Cheese createCheese() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Clams createClam() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
