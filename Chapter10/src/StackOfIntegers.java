public class StackOfIntegers {
    public int[] factors;

    public StackOfIntegers(int number) {
        factors = getFactors(number);
    }

    public int[] getFactors(int number) {
        int[] factors = new int[100];
        int factor = 2;
        int index = 0;
        while (factor <= number) {
            if (number % factor == 0) {
                factors[index] = factor;
                index++;
                number /= factor;
            } else {
                factor++;
            }
        }
        return factors;
    }
}
