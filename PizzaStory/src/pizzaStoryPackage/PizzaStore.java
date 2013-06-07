package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 05.06.13
 * Time: 23:42
 * To change this template use File | Settings | File Templates.
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String _type) {
        Pizza pizza;
        pizza = createPizza(_type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String _type);
}
