package pizzaStoryPackage;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 05.06.13
 * Time: 23:38
 * To change this template use File | Settings | File Templates.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    PizzaIngredientFactory ingredientFactory;

    public Pizza(PizzaIngredientFactory _ingredientFactory) {
        ingredientFactory = _ingredientFactory;
    }

    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

}
