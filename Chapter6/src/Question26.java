public class Question26 {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count != 100)
            if (isPrime(++number)) {
                System.out.print(number + " ");

                if (++count % 10 == 0) {
                    System.out.println();
                }
            }
    }

    public static boolean isPrime(int number) {
        for (int c = 2; c <= Math.sqrt(number); c++) {
            if (number % c == 0) {
                return false;
            }
        }
        return true;
    }
}
