import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        int[] inputs = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
            inputs[i] = scanner.nextInt();

        System.out.println("Index: " + indexOfSmallestElement(inputs));
    }

    public static int indexOfSmallestElement(int[] inputs) {
        int index = 0, smallest = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            if (inputs[i] < smallest) {
                index = i;
                smallest = inputs[i];
            }
        }

        return index;
    }
}
