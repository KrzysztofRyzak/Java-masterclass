public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                System.out.println("Number " + i + " is divided by 3 and 5");
                counter++;
                sum = sum + i;
                if (counter == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of the numbers divided by 3 and 5 is " + sum);
    }
}
