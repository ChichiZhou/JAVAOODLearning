package TEST;

public class Main {
    public static void main(String[] args) {
        Father father = new Father();
        Son1 son1 = new Son1();
        Son2 son2 = new Son2();

        son1.addElement("son1");
        son1.printout();

        son2.addElement("son2");
        son2.printout();

        System.out.println(son1.list);
        System.out.println(son2.list);

    }
}
