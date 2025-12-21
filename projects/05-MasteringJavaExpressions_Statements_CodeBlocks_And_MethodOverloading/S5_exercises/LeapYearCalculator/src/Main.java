public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1800));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        }
    }
}
