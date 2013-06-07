package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 06.06.13
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String _type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        if (_type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza(ingredientFactory);
            pizza.setName("California Style Cheese Pizza");
        } else if (_type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza(ingredientFactory);
            pizza.setName("California Style Pepperoni Pizza");
        } else if (_type.equals("clam")) {
            pizza = new CaliforniaStyleClamPizza(ingredientFactory);
            pizza.setName("California Style Clam Pizza");
        } else if (_type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza(ingredientFactory);
            pizza.setName("California Style Veggie Pizza");
        }
        return pizza;
    }
}
