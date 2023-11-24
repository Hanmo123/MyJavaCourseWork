public class Question5 {
    public static void main(MyString1[] args) {
        System.out.println("The prime factors of 120 are:");
        StackOfIntegers stack = new StackOfIntegers(120);
        for (int i = 0; i < stack.factors.length; i++) {
            if (stack.factors[i] == 0) {
                break;
            }
            System.out.print(stack.factors[i] + " ");
        }
    }
}
