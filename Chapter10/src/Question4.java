public class Question4 {
    public static void main(MyString1[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);
        System.out.println("Distance between point1 and point2 is " + MyPoint.distance(point1, point2));
    }
}
