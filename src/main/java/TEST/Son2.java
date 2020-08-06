package TEST;

public class Son2 extends Father{
    public void addElement(String element){
        list.add(element);
    }

    public void printout(){
        for (String string: list){
            System.out.println(string);
        }
    }
}
