package GoF.command.editor;

public class BoldCommand implements UndoableCommand{
    private String prevContent;
    private HtmlDocument htmlDocument;
    private History history;

    public BoldCommand(HtmlDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }

    @Override
    public void unexecute() {
        htmlDocument.setContent(prevContent);
    }

    @Override
    public void execute() {
        // htmlDocument 中现在的 content 将会是以后的 content
        prevContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        history.push(this);
    }
}
