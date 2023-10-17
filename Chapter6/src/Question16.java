public class Question16 {
    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "\t" + numberOfDaysInYear(year));
        }
    }

    public static int numberOfDaysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }
}
