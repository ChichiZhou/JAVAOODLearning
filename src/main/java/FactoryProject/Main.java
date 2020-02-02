package FactoryProject;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new TexasPizzaStore();
        pizzaStore.orderPizza("Big Ass");

    }
}
