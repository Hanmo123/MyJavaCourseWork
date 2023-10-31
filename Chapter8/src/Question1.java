public class Question1 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (double[] a : m) {
            sum += a[columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[][] m = MatrixUtil.next(3, 4);

        for (int x = 0; x < m[0].length; x++) {
            System.out.println(x + ": " + sumColumn(m, x));
        }
    }
}

/*
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
*/