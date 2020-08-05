package GoF.command;

import GoF.command.fx.Button;
import GoF.command.fx.Command;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);

        button.click();

    }
}
