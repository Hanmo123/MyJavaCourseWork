import java.util.Scanner;

public class Question45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Mean: " + mean(numbers) + "Variance: " + variance(numbers));
    }

    public static double mean(int[] array) {
        int sum = 0;

        for (int num : array)
            sum += num;

        return (double) sum / array.length;
    }

    public static double variance(int[] array) {
        double mean = mean(array);
        double diff = 0;

        for (int num : array) {
            diff += Math.pow(num - mean, 2);
        }

        return diff / array.length;
    }
}
