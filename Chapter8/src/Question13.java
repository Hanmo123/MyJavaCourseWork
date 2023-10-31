import java.util.Scanner;

public class Question13 {
    public static int[] locateLargest(double[][] a) {
        final double[] largest = {0};
        final int[] largestX = {0};
        final int[] largestY = {0};
        MatrixUtil.each(a, (x, y, v) -> {
            if (v > largest[0]) {
                largest[0] = v;
                largestX[0] = x;
                largestY[0] = y;
            }
        });
        return new int[]{largestX[0], largestY[0]};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] m = MatrixUtil.next(scanner.nextInt(), scanner.nextInt());

        int[] largest = locateLargest(m);
        System.out.println("(" + largest[0] + ", " + largest[1] + ")");
    }
}

/*
3 4
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
 */