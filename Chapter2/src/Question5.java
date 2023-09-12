import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Subtotal & rate: ");
        Double amount = scanner.nextDouble();
        Double rate = (double) scanner.nextInt() / 100;

        System.out.println(
                "Total: " + (amount * (1 + rate)) + " (Gratuity: " + (amount * rate) + ")"
        );
    }
}