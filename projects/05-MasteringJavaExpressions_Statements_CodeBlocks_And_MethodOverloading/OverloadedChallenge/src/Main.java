public class Main {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(9));
        System.out.println(convertToCentimeters(6,4));
    }

    public static double convertToCentimeters(int heightInches) {
        return  heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int remainingInches) {
        int feetToInches = (heightFeet * 12) + remainingInches;
        return convertToCentimeters(feetToInches);
    }
}
