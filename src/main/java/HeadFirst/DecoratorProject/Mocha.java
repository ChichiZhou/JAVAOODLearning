package HeadFirst.DecoratorProject;

public class Mocha extends Condiment{
    Beverage beverage;      // 由于是装饰器，所以需要有一个被装饰的对象
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public int cost() {
        return beverage.cost() + 2;
    }
}
