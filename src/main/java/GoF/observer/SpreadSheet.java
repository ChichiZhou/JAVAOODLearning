package GoF.observer;

public class SpreadSheet implements Observer{
    @Override
    public void update(Integer value) {
        System.out.println("Spreadsheet.notify");
    }
}
