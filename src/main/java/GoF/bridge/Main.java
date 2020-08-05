package GoF.bridge;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.turnOn();
    }
}
