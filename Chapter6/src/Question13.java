public class Question13 {
    public static void main(String[] args) {
        double result = 0;

        for (int i = 1; i <= 20; i++) {
            result += (double) i / (i + 1);

            System.out.println(i + "\t" + result);
        }
    }
}
