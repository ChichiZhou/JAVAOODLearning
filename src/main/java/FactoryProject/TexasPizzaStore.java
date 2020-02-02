package FactoryProject;

public class TexasPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type) {
        if (type.equals("Big Ass")){
            Pizza bigAss = new BigAss();
            return bigAss;
        }
        else{
            return null;
        }
    }
}
