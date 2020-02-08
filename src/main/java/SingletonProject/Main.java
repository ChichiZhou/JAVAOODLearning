package SingletonProject;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.createInstance("时琳", 29);
        singleton.showName();

    }
}
