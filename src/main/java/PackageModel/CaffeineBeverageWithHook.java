package PackageModel;

/**
 * 模板方法的主要作用是定义了一个算法步骤 （或许可以用到我的工作上去）
 * 并允许子类为一个或多个步骤提供实现
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){       // 这里定义成 final 之后，子类将无法覆盖
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiment();
        }
    }

    abstract void brew();      // 写成抽象方法的目的就是为了 ———— 让子类别忘了去实现！！！！！

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
