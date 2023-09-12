import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        long input = new Scanner(System.in).nextLong();

        int year = (int) Math.ceil(input / 60 / 24 / 365);
        int days = (int) (Math.ceil(input / 60 / 24) - year * 365);

        System.out.println(year + " Years and " + days + " Days");
    }
}
