package DecoratorProject;

/**
 * 装饰者和被装饰者要同根同源
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription());
    }
}
