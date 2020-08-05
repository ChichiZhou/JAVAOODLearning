package GoF.bridge;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony turn off");
    }

    @Override
    public void setChannel(Integer number) {
        System.out.println("Sony set channel");
    }
}
