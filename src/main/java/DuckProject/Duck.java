package DuckProject;

/**
 * 抽象类或者接口中可以有实例变量
 * 抽象类中可以有实例方法
 * 但是接口中不能有实例方法，接口中的方法都是抽象方法
 *
 * 抽象类里没有构造函数
 */

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    void performFly(){
        flyBehavior.fly();
    }

    void performQuack(){
        quackBehavior.quack();
    }

    void swim(){};

    public abstract void display();   // 抽象方法不能有函数体！！！

}
