public class Hello {

    public static void main (String[] args) {
        System.out.println("Hello, Chris");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("I'm scared of aliens");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");

        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);


        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double score = ((firstVariable + secondVariable) * 100.00d);
        double remainder;
        System.out.println("Score is " + score);
        remainder = score % 40.00d;
        System.out.println("remainder is " + remainder);
        boolean isNoRemainder = (remainder == 0.00) ? true : false;
        System.out.println("isNoRemainder is " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
