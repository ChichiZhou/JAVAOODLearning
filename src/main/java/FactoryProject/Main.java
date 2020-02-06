package FactoryProject;

public class Main {
    public static void main(String[] args) {
        /**
         * 工厂类有点像模板类的感觉
         * 都是把需要变化的当成一个参数传进来
         */
        PizzaStore pizzaStore = new TexasPizzaStore();
        pizzaStore.orderPizza("Big Ass");

    }
}
