import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distance: ");
        Double distance = scanner.nextDouble();

        System.out.print("Miles per gallon: ");
        Double MPG = scanner.nextDouble();

        System.out.print("Price per gallon: ");
        Double PPG = scanner.nextDouble();

        System.out.println(distance / MPG * PPG);
    }
}
