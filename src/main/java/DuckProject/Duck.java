package DuckProject;

public abstract class Duck {
    FlyAbility flyAbility;
    QuackAblitiy quackAblitiy;

    void performFly(){
        flyAbility.flymethod();
    };
    void performQuack(){
        quackAblitiy.quackMethod();
    };


}
