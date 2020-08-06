package GoF.command;

import GoF.command.editor.BoldCommand;
import GoF.command.editor.History;
import GoF.command.editor.HtmlDocument;
import GoF.command.editor.UndoCommand;
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

        History history = new History();
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.setContent("HELLO WORLD");
        BoldCommand boldCommand = new BoldCommand(htmlDocument, history);
        boldCommand.execute();
        System.out.println(htmlDocument.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(htmlDocument.getContent());


    }
}
