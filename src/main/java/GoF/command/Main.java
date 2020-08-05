package GoF.command;

import GoF.command.fx.Button;
import GoF.command.fx.Command;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Command resizeCommand = new ResizeCommand();
        Command blackAndWhiteCommand = new BlackAndWhiteCommand();
        Button button = new Button(command);

        button.click();

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(command);
        compositeCommand.add(resizeCommand);
        compositeCommand.add(blackAndWhiteCommand);

        compositeCommand.execute();

    }
}
