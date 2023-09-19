import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputs = new int[3];
        for (int i = 0; i < inputs.length; i++)
            inputs[i] = scanner.nextInt();

        Arrays.sort(inputs);

        for (int input : inputs) System.out.println(input);
    }
}
