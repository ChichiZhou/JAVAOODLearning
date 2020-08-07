package GoF.visitor;

public class HighLightOperation implements Operation{
    // 使用方法的重载来实现对不同class的行为实现
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Hightlight-anchor");

    }
}
