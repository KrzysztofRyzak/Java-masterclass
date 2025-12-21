public class Main {
    public static void main(String[] args) {
        char variable = 'A';

        switch (variable) {
            case 'A':
                System.out.println(variable + " character represent in NATO: Able");
                break;
            case 'B':
                System.out.println(variable + " character represent in NATO: Baker");
                break;
            case 'C':
                System.out.println(variable + " character represent in NATO: Charlie");
                break;
            case 'D':
                System.out.println(variable + " character represent in NATO: Dog");
                break;
            case 'E':
                System.out.println(variable + " character represent in NATO: Easy");
                break;
            default:
                System.out.println("Letter " + variable + " was not found in a switch");
                break;
        }
    }
}
