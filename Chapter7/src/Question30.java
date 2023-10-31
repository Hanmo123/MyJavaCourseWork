import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] inputs = new int[count];
        for (int i = 0; i < count; i++) {
            inputs[i] = scanner.nextInt();
        }
        System.out.println(isConsecutiveFour(inputs));
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 0;
        int number = 0;

        for (int value : values) {
            if (value > number) {
                number = value;
                count = 0;
            } else if (value == number) {
                if (++count == 4) {
                    return true;
                }
            }
        }

        return false;
    }
}
