import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        printCalendar(year);

        scanner.close();
    }

    public static void printCalendar(int year) {
        for (int month = 1; month <= 12; month++) {
            System.out.println("\n" + getMonthName(month) + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            int startDay = getStartDay(year, month);
            int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= numberOfDaysInMonth; day++) {
                System.out.printf("%3d ", day);

                if ((day + startDay) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return monthNames[month];
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalDays = getTotalNumberOfDays(year, month);
        return (totalDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int totalDays = 0;

        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        for (int i = 1; i < month; i++) {
            totalDays += getNumberOfDaysInMonth(year, i);
        }

        return totalDays;
    }
}
