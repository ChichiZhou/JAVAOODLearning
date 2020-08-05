package HeadFirst.PackageModel;

public class Main {
    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        System.out.println("\nMake coffee ...");
        coffee.prepareRecipe();

        /**
         * Make some tea
         */
        TeaWithHook tea = new TeaWithHook();
        tea.prepareRecipe();
    }

}
