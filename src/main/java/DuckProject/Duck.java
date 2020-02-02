package DuckProject;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performFly(){
        flyBehavior.fly();
    }

    void performQuack(){
        quackBehavior.quack();
    }

    void swim(){};

}
