package GoF.statepattern;

public class Main {
    public static void main(String[] args) {
        // Canvas 的创建不需要构造器，使用默认构造器即可
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

}
