import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        String[] labels = {"scissor", "rock", "paper"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");

        int[] punches = {
                (int) (Math.random() * 3),
                scanner.nextInt()
        };

        System.out.print("The computed is " + labels[punches[0]] + ". You are " + labels[punches[1]]);
        if (punches[0] == punches[1]) {
            System.out.println(" too. It is a draw");
        } else {
            if ((punches[0] == 0 && punches[1] == 1) || (punches[0] == 1 && punches[1] == 0) || (punches[0] == 2 && punches[1] == 1)) {
                System.out.println(". You lost");
            } else {
                System.out.println(". You Win");
            }
        }
    }
}
