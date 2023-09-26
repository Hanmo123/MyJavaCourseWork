import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String haystack = scanner.next();
        String needle = scanner.next();

        System.out.println(haystack.contains(needle));
    }
}