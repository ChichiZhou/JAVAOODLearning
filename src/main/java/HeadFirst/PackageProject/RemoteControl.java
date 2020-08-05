package HeadFirst.PackageProject;

public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;

    public RemoteControl(){
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++){
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        this.onCommand[slot].execute();
    }

    public void offButtonWasPressed(int slot){
        this.offCommand[slot].execute();
    }
}
