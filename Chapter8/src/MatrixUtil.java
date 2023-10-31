import java.util.Scanner;

@FunctionalInterface
interface TriConsumer<T, U, V> {
    void accept(T t, U u, V v);
}

public class MatrixUtil {
    public static double[][] next(int yc, int xc) {
        Scanner scanner = new Scanner(System.in);
        double[][] m = new double[yc][xc];

        for (int y = 0; y < m.length; y++) {
            for (int x = 0; x < m[y].length; x++) {
                m[y][x] = scanner.nextDouble();
            }
        }

        return m;
    }

    public static int[][] intNext(int yc, int xc) {
        Scanner scanner = new Scanner(System.in);
        int[][] m = new int[yc][xc];

        for (int y = 0; y < m.length; y++) {
            for (int x = 0; x < m[y].length; x++) {
                m[y][x] = scanner.nextInt();
            }
        }

        return m;
    }

    public static void each(double[][] matrix, TriConsumer<Integer, Integer, Double> action) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                action.accept(y, x, matrix[y][x]);
            }
        }
    }
}
