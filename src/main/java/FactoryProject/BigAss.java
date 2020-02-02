package FactoryProject;

public class BigAss extends Pizza{
    public BigAss(){
        name = "BigAss";
        price = 20.0;
    }   // 这里不能用 String name double price
        // 因为继承了父类，可以直接继承父类中的实例变量
}
