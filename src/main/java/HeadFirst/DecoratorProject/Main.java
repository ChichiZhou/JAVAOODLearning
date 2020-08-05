package HeadFirst.DecoratorProject;

public class Main {
    public static void main(String[] args) {
        Expresso expresso = new Expresso();
        Beverage beverage = new Mocha(expresso);

        System.out.println(beverage.cost());
    }
}
