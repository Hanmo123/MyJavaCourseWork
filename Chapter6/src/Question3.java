import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(isPalindrome(scanner.nextInt()) ? "true" : "false");
    }

    public static int reverse(int number) {
        return Integer.parseInt(new StringBuffer(Integer.toString(number)).reverse().toString());
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}