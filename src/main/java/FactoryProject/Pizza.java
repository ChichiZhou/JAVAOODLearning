package FactoryProject;

public abstract class Pizza {
    String name;
    double price;

    void cookPizza(){
        System.out.println("Pizza Name" + " " + name + "\n");
        System.out.println("Pizza Price" + " " + price + "\n");
        System.out.println("Pizza Done");
    }


}
