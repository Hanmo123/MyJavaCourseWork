import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");

        double a = scanner.nextDouble(),
                b = scanner.nextDouble(),
                c = scanner.nextDouble();

        double det = Math.pow(b, 2) - 4 * a * c;

        if (det >= 0) {
            double[] roots = new double[2];
            roots[0] = (-b + Math.sqrt(det)) / 2 / a;
            roots[1] = (-b - Math.sqrt(det)) / 2 / a;

            if (roots[0] == roots[1])
                System.out.println("The equation has one root " + roots[0]);
            else
                System.out.println("The equation has two roots " + roots[0] + ", " + roots[1]);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}