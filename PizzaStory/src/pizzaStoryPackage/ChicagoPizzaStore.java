package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 06.06.13
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String _type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (_type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (_type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else if (_type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (_type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        return pizza;
    }
}
