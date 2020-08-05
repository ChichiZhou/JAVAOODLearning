package GoF.visitor;

public class Main {
    /**
     * GoF.visitor pattern 的作用是添加新的功能但是不改变原有的代码
     * @param args
     */
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        document.execute(new HighLightOperation());

    }
}
