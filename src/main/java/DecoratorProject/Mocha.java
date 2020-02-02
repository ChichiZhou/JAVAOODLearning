package DecoratorProject;

public class Mocha extends CondimentDecorate{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + " " + "Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }   // 实现父类的抽象方法
}
