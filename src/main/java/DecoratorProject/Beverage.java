package DecoratorProject;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();  // 抽象方法，子类必须实现父类的抽象方法
}
