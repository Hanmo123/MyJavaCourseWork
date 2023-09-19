import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(),
                y = scanner.nextInt();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Point (" + x + ", " + y + ") is " + (distance > 10 ? "not " : "") + "in the circle");
    }
}
