import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (password.length() < 8)
            throw new Exception("Password must have at least 8 characters.");

        if (!validateRegax(password))
            throw new Exception("Password must have Alpha and at least 2 Numbers.");

        System.out.println("Validated.");
    }

    public static boolean validateRegax(String input) {
        String regex = "^(?=(.*[0-9]){2,})(?=.*[a-zA-Z]).*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
