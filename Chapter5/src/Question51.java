import java.util.Scanner;

public class Question51 {
    public static void main(String[] args) throws Exception {
        int repeated = 0;

        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[2];

        inputs[0] = scanner.nextLine();
        inputs[1] = scanner.nextLine();

        for (int i = 0; i < Math.min(inputs[0].length(), inputs[1].length()); i++) {
            if (inputs[0].charAt(i) == inputs[1].charAt(i)) {
                repeated++;
            }
        }

        if (repeated > 0)
            System.out.println(inputs[0].substring(0, repeated));
        else throw new Exception("no common prefix");
    }
}
