public class Question19 {
    public static boolean isConsecutiveFour(int[][] values) {
        if (checkRows(values)) return true;
        if (checkColumns(values)) return true;
        if (checkDiagonals(values)) return true;
        return false;
    }

    private static boolean checkRows(int[][] values) {
        for (int[] value : values) {
            for (int j = 0; j <= value.length - 4; j++) {
                if (value[j] == value[j + 1] &&
                        value[j] == value[j + 2] &&
                        value[j] == value[j + 3]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkColumns(int[][] values) {
        for (int i = 0; i <= values.length - 4; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] == values[i + 1][j] &&
                        values[i][j] == values[i + 2][j] &&
                        values[i][j] == values[i + 3][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonals(int[][] values) {
        for (int i = 0; i <= values.length - 4; i++) {
            for (int j = 0; j <= values[i].length - 4; j++) {
                if (values[i][j] == values[i + 1][j + 1] &&
                        values[i][j] == values[i + 2][j + 2] &&
                        values[i][j] == values[i + 3][j + 3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= values.length - 4; i++) {
            for (int j = values[i].length - 1; j >= 3; j--) {
                if (values[i][j] == values[i + 1][j - 1] &&
                        values[i][j] == values[i + 2][j - 2] &&
                        values[i][j] == values[i + 3][j - 3]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] m = MatrixUtil.intNext(6, 7);

        System.out.println(isConsecutiveFour(m));
    }
}
