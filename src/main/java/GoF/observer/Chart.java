package GoF.observer;

public class Chart implements Observer{
    @Override
    public void update(Integer value) {
        System.out.println("Chart get updated");
    }
}
