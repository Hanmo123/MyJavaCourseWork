import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int last = 0;

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int input = scanner.nextInt();
            if (input < last) {
                System.out.println(false);
                return;
            } else {
                last = input;
            }
        }
        System.out.println(true);
    }
}
