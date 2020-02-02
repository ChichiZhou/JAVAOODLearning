package FactoryProject;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.cookPizza();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
