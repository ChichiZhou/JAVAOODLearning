package DecoratorProject;

/**
 * 装饰者和被装饰者要同根同源
 * 这样才能不断的迭代
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        beverage = new Mocha(beverage);  // 不断迭代来计算出最后的价格

        System.out.println(beverage.getDescription());
    }
}
