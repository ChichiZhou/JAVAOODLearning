package GoF.command.fx;

public class Button {
    private String label;
    private Command command;   // Button 需要 command 来创建新的对象。所以 Button 和 Command 之间的关系是 composition 的

    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
