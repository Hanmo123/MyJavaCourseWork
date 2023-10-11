import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class Question41 {
    public Question41() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        int max = 0, count = 0;
        Scanner scanner = new Scanner(System.in);

        for (String i : scanner.nextLine().split(" ")) {
            try {
                int number = Integer.parseInt(i);

                if (number > max) {
                    max = number;
                    count = 1;
                } else if (number == max) {
                    count++;
                }
            } catch (Throwable e) {
                System.out.println("No numbers");
            }
        }
        System.out.println("MAX: " + max + " COUNT: " + count);
    }
}
