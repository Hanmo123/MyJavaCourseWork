import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String regex = "\\d{3}-\\d{2}-\\d{4}";

        boolean isMatch = str.matches(regex);

        System.out.println(isMatch ? "valid" : "invalid");
    }
}