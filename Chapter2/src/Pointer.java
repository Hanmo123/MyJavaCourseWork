public class Pointer {
    double x;
    double y;

    public Pointer(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcDistance(Pointer pointer) {
        return Math.sqrt(Math.pow(this.x - pointer.x, 2) + Math.pow(this.y - pointer.y, 2));
    }
}
