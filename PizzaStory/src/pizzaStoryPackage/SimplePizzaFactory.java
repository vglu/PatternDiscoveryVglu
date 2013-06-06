package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 05.06.13
 * Time: 23:31
 * To change this template use File | Settings | File Templates.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String _type) {
        Pizza pizza = null;
        if (_type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (_type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (_type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (_type.equals("veggie")) {
                pizza = new VeggiePizza();
        }
        return pizza;
    }
}
