package pizzaStoryPackage;

/**
 * Created with IntelliJ IDEA.
 * User: vgl
 * Date: 06.06.13
 * Time: 17:43
 * To change this template use File | Settings | File Templates.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        System.out.println("ADD ThickCrustDough");
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("ADD PlimTomatoSauce");
        return new PlimTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("ADD Mozzarella");
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {

        Veggies veggies[] = {new Spinach(), new EggPlant(), new BlackOlives()};
        System.out.println("ADD Spinach EggPlant BlackOlives");
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("ADD SlicedPepperoni");
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        System.out.println("ADD FrozenClams");
        return new FrozenClams();
    }
}
