package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 06.06.13
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String _type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (_type.equals("cheese")) {
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (_type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (_type.equals("clam")) {
            pizza = new NYStyleClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (_type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
