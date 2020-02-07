package DuckProject;

public class MallardDuckSon extends MallardDuck{
    public MallardDuckSon(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        super(flyBehavior, quackBehavior);   // 这个构造函数是父类继承来的

    }

    void performFly(){
        System.out.println("I am Son");
        super.performFly();   // 用这种方法  super 调用父类的方法
    }
}
