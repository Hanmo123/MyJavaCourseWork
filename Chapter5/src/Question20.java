public class Question20 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 1000; i++) {
            if (!isPrime(i)) continue;

            System.out.print(i + " ");

            if (++count % 8 == 0) {
                System.out.println();
            }
        }
    }

    public static boolean isPrime(int target) {
        for (int c = 2; c <= Math.sqrt(target); c++) {
            if (target % c == 0) {
                return false;
            }
        }
        return true;
    }
}
