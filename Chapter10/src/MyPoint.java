public class MyPoint {
    protected double x;
    protected double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    public double distance(MyPoint point) {
        return this.distance(point.getX(), point.getY());
    }

    public static double distance(MyPoint point1, MyPoint point2) {
        return point1.distance(point2);
    }
}