package templMethod;

/**
 * Created with IntelliJ IDEA for studing Design patterns
 * User: vgl
 * Date: 12.06.13
 * Time: 11:48
 */
public class Cofee extends CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brewCofeeGrinds();
        pourinCup();
        addSugarAndMilk();
    }

    @Override
    protected void brew() {
        this.brewCofeeGrinds();
    }

    @Override
    protected void addCondiments() {
        this.addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        print("Adding Sugar and Milk");
    }


    private void brewCofeeGrinds() {
        print("Dripping Cofee through filter");
    }

}
