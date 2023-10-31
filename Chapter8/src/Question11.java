import java.util.Scanner;

public class Question11 {
    public static String StringPad(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = 0;
        for (String i : StringPad(Integer.toBinaryString(scanner.nextInt()), 9).split("")) {
            System.out.print(i.equals("1") ? "T" : "H" + (++index % 3 == 0 ? "\n" : ""));
        }
    }
}
