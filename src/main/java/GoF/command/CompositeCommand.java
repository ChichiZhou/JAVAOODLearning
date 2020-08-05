package GoF.command;

import GoF.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    // 在这里面定义了一个 Collection
    // 不知道这种写法是否合理？？？？？

    private List<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }
    @Override
    public void execute() {
        for (Command command: commands){
            command.execute();
        }
    }
}
