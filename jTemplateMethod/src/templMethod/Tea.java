package templMethod;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 12.06.13
 * Time: 11:56
 */
public class Tea extends CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourinCup();
        addLemon();
    }

    @Override
    protected void brew() {
        this.steepTeaBag();
    }

    @Override
    protected void addCondiments() {
        this.addLemon();
    }


    private void addLemon() {
        print("Adding Lemon");
    }


    private void steepTeaBag() {
        print("Steeping the tea");
    }

}
