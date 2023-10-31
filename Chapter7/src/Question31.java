import java.util.Arrays;
import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: ");
        int[] inputs1 = new int[scanner.nextInt()];
        for (int i = 0; i < inputs1.length; i++) {
            inputs1[i] = scanner.nextInt();
        }

        System.out.println("2: ");
        int[] inputs2 = new int[scanner.nextInt()];
        for (int i = 0; i < inputs2.length; i++) {
            inputs2[i] = scanner.nextInt();
        }

        int[] list = new int[inputs1.length + inputs2.length];
        int index = 0;
        for (int number : inputs1) {
            list[index++] = number;
        }
        for (int number : inputs2) {
            list[index++] = number;
        }
        Arrays.sort(list);

        for (int number : list) {
            System.out.print(number + " ");
        }
    }
}
