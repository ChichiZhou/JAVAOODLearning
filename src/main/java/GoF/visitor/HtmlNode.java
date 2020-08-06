package GoF.visitor;

public interface HtmlNode {
    // 这里只是把 operation 当做参数传递进去
    // 该类与 Operation 之间的关系是 dependency
    void execute(Operation operation);
}
