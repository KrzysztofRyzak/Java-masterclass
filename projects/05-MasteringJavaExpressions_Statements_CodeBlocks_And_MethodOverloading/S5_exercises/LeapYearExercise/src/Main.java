public class Main {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        int daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeapYear(year)?29:28;
            case 4,6,9,11 -> 30;
            default -> -1;
        };
        return daysInMonth;
    }

}

