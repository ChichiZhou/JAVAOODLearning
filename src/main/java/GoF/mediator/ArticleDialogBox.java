package GoF.mediator;

public class ArticleDialogBox extends DialogBox{
    // 所有的 box 都是依赖这个 dialog box 所生成的
    private ListBox articleListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
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
        } else if (control == titleTextBox){
            titleChanged();
        }
    }

    private void articleSeletced(){
        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnable(true);
    }

    private void titleChanged(){
        String content = titleTextBox.getContent();
        Boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setEnable(!isEmpty);
    }
}
