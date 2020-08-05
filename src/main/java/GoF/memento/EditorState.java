package GoF.memento;

/**
 * 其作用是保存之前的操作
 */
public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
