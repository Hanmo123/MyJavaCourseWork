public class Question3 {
    static int[] charts = new int[10];

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
            for (char c : String.valueOf(i).toCharArray())
                charts[c - 48]++;

        for (int i : charts) {
            System.out.println(i);
        }
    }
}