package DuckProject;

public class MallardDuck extends Duck{
    /**
     * 这里可以写两个构造函数，属于构造函数的重载
     */

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public MallardDuck(){}

    public void display(){
        System.out.println("I am a Mallard Duck");
    }
}
