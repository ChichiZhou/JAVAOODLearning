package PackageProject;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(0, lightOnCommand, new NoCommand());

        remoteControl.onButtonWasPressed(0);

    }
}
