package HeadFirst.PackageModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

    public void brew() {
        System.out.println("Dripping Coffee through fileter");
    }

    public void addCondiment() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;

        System.out.print("Would you like milk and sugar with your coffee (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            answer = in.readLine();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
