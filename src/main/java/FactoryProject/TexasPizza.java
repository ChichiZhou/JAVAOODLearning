package FactoryProject;

public class TexasPizza extends PizzaStore{
    protected Pizza createPizza(String type) {
        if (type.equals("BigAss")){
            System.out.println("BIG ASS PIZZA");
            return new BigAss("BIGASS!!!!");
        }
        return null;
    }
}
