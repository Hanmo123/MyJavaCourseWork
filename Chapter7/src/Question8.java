import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intInputs = new int[10];
        double[] doubleInputs = new double[10];

        for (int i = 0; i < 10; i++)
            intInputs[i] = scanner.nextInt();
        System.out.println(average(intInputs));

        for (int i = 0; i < 10; i++)
            doubleInputs[i] = scanner.nextDouble();
        System.out.println(average(doubleInputs));
    }

    public static double average(double[] inputs) {
        double total = 0;
        for (double i : inputs)
            total += i;
        return total / inputs.length;
    }

    public static int average(int[] inputs) {
        int total = 0;
        for (int i : inputs)
            total += i;
        return total / inputs.length;
    }
}
