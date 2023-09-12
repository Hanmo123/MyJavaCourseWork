import java.util.Scanner;

public class Question14 {
    final double POUND_TO_KG = 0.45359237;
    final double INCH_TO_M = 0.0254;

    public static void main(String[] args) {
        Question14 question14 = new Question14();
    }

    public Question14() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (pounds): ");
        double weight = scanner.nextDouble() * POUND_TO_KG;

        System.out.print("Height (inches): ");
        double height = scanner.nextDouble() * INCH_TO_M;

        double BMI = weight / Math.pow(height, 2);

        System.out.println("BMI: " + BMI);
    }
}
