public class Question43 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 7; i++) {
            for (int a = 1; a < i; a++) {
                System.out.println("" + i + a);
                count++;
            }
        }

        System.out.println(count + "个");
    }
}
