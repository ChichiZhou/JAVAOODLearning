package GoF.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node){
        nodes.add(node);
    }

    // 传入 operation
    public void execute(Operation operation){
        for(HtmlNode node: nodes){
            node.execute(operation);
        }
    }
}
