package GoF.chainOfResponsibility;

public abstract class Handler {
    private Handler next;   // 用来存储下一个动作。就像链表中的节点一样

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){
        if (doHandle(request)) return;

        if (next != null)
            next.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);
}
