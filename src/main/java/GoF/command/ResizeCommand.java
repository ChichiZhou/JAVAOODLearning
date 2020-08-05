package GoF.command;

import GoF.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize command");
    }
}
