public class Question17 {
    public static void main(MyString1[] args) {
//        找出大于LONG.MAX_VALUE的前10个平方数
        long i = 1;
        int count = 0;
        while (count < 10) {
            long square = i * i;
            if (square < 0) {
                count++;
                System.out.println(count + ": " + i);
            }
            i++;
        }
    }
}
