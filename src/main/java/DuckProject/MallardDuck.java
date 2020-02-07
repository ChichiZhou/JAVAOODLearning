package DuckProject;

public class MallardDuck extends Duck{
    /**
     * 这里可以写两个构造函数，属于构造函数的重载
     * 类变量可以继承，构造函数也可以继承
     *
     * 所以这里就不用再次声明 类变量 了！！！
     */

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public MallardDuck(){};

    public void display(){
        System.out.println("I am a Mallard Duck");
    }
}
