import java.util.Scanner;

class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");
        Point[] points = new Point[inputs.length / 2];

        int inputIndex = 0;
        for (int pointIndex = 0; pointIndex < points.length; pointIndex++) {
            points[pointIndex] = new Point(Double.parseDouble(inputs[inputIndex++]), Double.parseDouble(inputs[inputIndex++]));
        }

        Point[][] closestPairs = new Point[points.length][2];
        int closestPairIndex = 0;
        double distance = Double.MAX_VALUE;
        for (int fromIndex = 0; fromIndex < points.length; fromIndex++){
            for (int toIndex = fromIndex + 1; toIndex < points.length; toIndex++) {
                if (points[fromIndex].getDistance(points[toIndex]) < distance) {
                    closestPairs = new Point[points.length][2];
                    closestPairIndex = 0;

                    distance = points[fromIndex].getDistance(points[toIndex]);
                    closestPairs[closestPairIndex++] = new Point[]{points[fromIndex], points[toIndex]};
                } else if (points[fromIndex].getDistance(points[toIndex]) == distance) {
                    closestPairs[closestPairIndex++] = new Point[]{points[fromIndex], points[toIndex]};
                }
            }
        }

        for (Point[] pair : closestPairs) {
            if (pair[0] == null) break;
            System.out.println(pair[0].x + " " + pair[0].y + " - " + pair[1].x + " " + pair[1].y);
        }
        System.out.println(distance);
    }
}
