package templMethod;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 12.06.13
 * Time: 11:49
 */
public abstract class CaffeineBeverage {
    public void print(String _text) {
        System.out.println(_text);
    }

    public void prepareRecipe() {
        boilWater();
        brew();
        pourinCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    public void boilWater() {
        print("Boiling water");
    }
    public void pourinCup() {
        print("Pouring into cup");
    }
}
