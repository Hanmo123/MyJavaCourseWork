import java.util.Scanner;

public class Question5 {
    static int[] numbers = new int[10];

    public static void main(String[] args) {
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();

            if (!contains(number))
                numbers[index++] = number;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static boolean contains(int number) {
        for (int i : numbers)
            if (number == i)
                return true;
        return false;
    }
}
