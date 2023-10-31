import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputs = new int[5];

        for (int i = 0; i < 5; i++) {
            inputs[i] = scanner.nextInt();
        }

        System.out.println(gcd(inputs));
    }

    public static int gcd(int... numbers) {
        int max = 1;

        outer:
        for (int i = 1; i <= numbers[0]; i++) {
            if (i < max) continue;
            for (int n : numbers) {
                if (numbers[0] % i != 0) {
                    continue outer;
                }
            }
            if (i > max) max = i;
        }

        return max;
    }
}
