import java.io.IOException;
import java.io.InputStreamReader;

public class Question9 {
    public static void main(String[] args) {
        try {
            System.out.println(new InputStreamReader(System.in).read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}