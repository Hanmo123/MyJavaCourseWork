import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 y1:");
        Pointer p1 = new Pointer(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Enter x2 y2:");

        System.out.println(new Pointer(scanner.nextDouble(), scanner.nextDouble()).calcDistance(p1));
    }
}

