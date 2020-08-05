package GoF.mediator;

public class ArticleDialogBox extends DialogBox{
    private ListBox articleListBox = new ListBox(this);
    private TextBox titletextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction(){
        articleListBox.setSelection("Article 1");
        System.out.println("Text");
        System.out.println("button");
    }

    @Override
    public void changed(UIControl control) {
        if(control == articleListBox){
            articleSeletced();
        } else if (control == titletextBox){
            titleChanged();
        }
    }

    private void articleSeletced(){
        titletextBox.setContent(articleListBox.getSelection());
        saveButton.setEnable(true);
    }

    private void titleChanged(){
        String content = titletextBox.getContent();
        Boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setEnable(!isEmpty);
    }
}
