import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        int line = new Scanner(System.in).nextInt();

        for (int i = 1; i <= line; i++) {
            System.out.print("  ".repeat(line - i));
            for (int c = i; c >= 1; c--)
                System.out.print(c + " ");
            for (int c = 2; c <= i; c++)
                System.out.print(c + " ");
            System.out.println();
        }
    }
}