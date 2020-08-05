package HeadFirst.PackageModel;

public class TeaWithHook extends CaffeineBeverageWithHook{

    void brew() {
        System.out.println("I make tea");
    }

    void addCondiment() {
        System.out.println("I add condiment");
    }
}
