import java.util.ArrayList;
import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        ArrayList<Integer> tried = new ArrayList<Integer>();
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = scanner.nextInt();

        while (number1 + number2 != answer) {
            if (tried.contains(answer)) {
                System.out.println("You already tried " + answer + ". Try again. What is " + number1 + " + " + number2 + "?");
            } else {
                System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "?");
                tried.add(answer);
            }
            answer = scanner.nextInt();
        }

        System.out.println("You got it!");
    }
}
