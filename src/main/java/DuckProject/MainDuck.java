package DuckProject;

/**
 * 如果这些写成接口的话，假设许多DUCK都做着同样的方法 a，如果 a 发生了变化，则所有实现 a 的方法都会发生变化。
 * 这就是为什么不写成接口的原因
 * 也就是说，接口无法进行复用
 */
public class MainDuck {
    public static void main(String[] args) {
        MallardDuck duck1 = new MallardDuck();

        duck1.performFly();
        duck1.performQuack();


    }
}
