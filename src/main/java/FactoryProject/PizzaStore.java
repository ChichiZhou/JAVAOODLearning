package FactoryProject;

public abstract class PizzaStore {
    public void order(String type){
        Pizza pizza = createPizza(type);
        System.out.println("Done");
    }

    /**
     * 与模板类不同的是，把不同的东西当做抽象类
     * 而模板类指的是，模板类是当做参数传递进去的
     * @param type
     * @return
     */

    protected abstract Pizza createPizza(String type);
}
