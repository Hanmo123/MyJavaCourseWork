public class Question6 {
    public static void main(String[] args) {
        int total = 0;
        long number = Math.round(Math.random() * 1000);

        for (int e : String.valueOf(number).toCharArray())
            total += e - 48;

        System.out.println(number);
        System.out.println(total);
    }
}
