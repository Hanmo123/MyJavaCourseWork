import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.next()) {
            case "Feb" -> System.out.println(scanner.nextInt() % 4 == 0 ? 29 : 28);
            case "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec" -> System.out.println(31);
            case "Apr", "Jun", "Sep", "Nov" -> System.out.println(30);
            default -> throw new Exception("输入错误");
        }
    }
}