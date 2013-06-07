package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 06.06.13
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 */
public class ChicagoStyleCheesePizza extends CheesePizza {

    public ChicagoStyleCheesePizza(PizzaIngredientFactory _ingredientFactory) {
        super(_ingredientFactory);
    }


    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
