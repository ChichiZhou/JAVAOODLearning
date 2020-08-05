package GoF.flyweight;

public class Point {
    private Integer x;
    private Integer y;
    private PointIcon poinIcon;


    public Point(Integer x, Integer y, PointIcon poinIcon) {
        this.x = x;
        this.y = y;
        this.poinIcon = poinIcon;
    }

    public void draw(){
        System.out.printf("%s at (%d, %d)", poinIcon.getType(), x, y);
    }
}
