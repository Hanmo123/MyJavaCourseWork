public class Question5 {
    public static void addMatrix(double[][] a, double[][] b) {
        double[][] m = new double[a.length][a[0].length];

        MatrixUtil.each(a, (x, y, v) -> {
            m[y][x] += v;
        });
        MatrixUtil.each(b, (x, y, v) -> {
            m[y][x] += v;
        });

        MatrixUtil.each(m, (x, y, v) -> {
            System.out.println(v);
        });
    }

    public static void main(String[] args) {
        addMatrix(
                MatrixUtil.next(3, 3),
                MatrixUtil.next(3, 3)
        );

    }
}

/*
1 2 3
4 5 6
7 8 9
0 2 4
1 4.5 2.2
1.1 4.3 5.2
*/