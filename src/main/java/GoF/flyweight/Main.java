package GoF.flyweight;

public class Main {
    public static void main(String[] args) {
        PointService pointService = new PointService(new PointIconFactory());
        for(Point point: pointService.getPoints()){
            point.draw();
        }
    }
}