package GoF.statepattern;

public class Main {
    /**
     * State 用于避免重复代码
     * 我们想要 canvas performance different depends on different tool
     * 却别在于这里有不同的 state
     *
     *
     * Open close principle: Open for extension, close for modification
     * 如果需要添加新的 functionality，不能改变已有的 code
     * 这样避免了添加一个功能但是破坏了之前的功能
     *
     * Change behavior of an object
     *
     */
    public static void main(String[] args) {

        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

}
