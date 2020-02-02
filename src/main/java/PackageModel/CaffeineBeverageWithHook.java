package PackageModel;

public abstract class CaffeineBeverageWithHook {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiment();
        }
    }

    abstract void brew();

    abstract void addCondiment();

    void boilWater(){
        System.out.println(("Boiling water"));
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
