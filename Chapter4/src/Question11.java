import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 15 && number >= 0) {
            System.out.println(Integer.toHexString(number).toUpperCase());
        } else {
            throw new Exception("无效输入");
        }
    }
}