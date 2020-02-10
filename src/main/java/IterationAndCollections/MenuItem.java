package IterationAndCollections;

import lombok.AllArgsConstructor;

@AllArgsConstructor            // 这个要求所有已经声明的变量都需要赋值才能初始化
public class MenuItem {
    String name;
    String description;
    double price;

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }
}
