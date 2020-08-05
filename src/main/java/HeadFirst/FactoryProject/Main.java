package HeadFirst.FactoryProject;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new TexasPizza();
        pizzaStore.order("BigAss");
    }
}
