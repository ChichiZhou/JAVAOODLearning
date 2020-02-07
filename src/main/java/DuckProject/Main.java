package DuckProject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        MallardDuck mallardDuck = new MallardDuck(new FlyWithWings(), new QuackWithMouse());

        mallardDuck.performFly();

    }
}
