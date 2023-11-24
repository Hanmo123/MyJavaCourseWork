import java.math.BigDecimal;
import java.math.MathContext;

public class Question20 {
    public static void main(MyString1[] args) {
        int precision = 50; // 设置精度
        BigDecimal e = calculateE(precision);
        System.out.println("Approximation of e with precision " + precision + ": " + e);

        precision = 100; // 设置精度
        e = calculateE(precision);
        System.out.println("Approximation of e with precision " + precision + ": " + e);

        precision = 200; // 设置精度
        e = calculateE(precision);
        System.out.println("Approximation of e with precision " + precision + ": " + e);

        precision = 1000; // 设置精度
        e = calculateE(precision);
        System.out.println("Approximation of e with precision " + precision + ": " + e);
    }

    private static BigDecimal calculateE(int precision) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal factorial = BigDecimal.ONE;

        for (int i = 1; i <= precision; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
            e = e.add(BigDecimal.ONE.divide(factorial, new MathContext(precision)));
        }

        return e;
    }
}
