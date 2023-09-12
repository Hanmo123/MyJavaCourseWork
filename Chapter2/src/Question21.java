import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Interset: ");
        double interset = scanner.nextDouble() / 100;

        System.out.print("Year: ");
        int year = scanner.nextInt();

        System.out.println(amount * Math.pow(1 + interset / 12, year * 12));
    }
}
