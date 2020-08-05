package HeadFirst.SingletonProject;

public class Singleton {
    private String name;
    private int age;
    private static Singleton uniqueinstance;   // 占着位置！！！

    private Singleton(String name, int age){   // 精髓就在于把构造函数写成是 private
        this.name = name;
        this.age = age;
    }

    public static Singleton createInstance(String name, int age){
        if (uniqueinstance == null){
            uniqueinstance = new Singleton(name, age);
        }

        return uniqueinstance;
    }

    public void showName(){
        System.out.println(this.name);
    }


}
