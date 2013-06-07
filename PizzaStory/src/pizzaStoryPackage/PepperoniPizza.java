package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 05.06.13
 * Time: 23:39
 * To change this template use File | Settings | File Templates.
 */
public class PepperoniPizza extends Pizza {

    public PepperoniPizza(PizzaIngredientFactory _ingredientFactory) {
        super(_ingredientFactory);
    }
    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough       = ingredientFactory.createDough();
        sauce       = ingredientFactory.createSauce();
        cheese      = ingredientFactory.createCheese();
        pepperoni   = ingredientFactory.createPepperoni();
    }
}
