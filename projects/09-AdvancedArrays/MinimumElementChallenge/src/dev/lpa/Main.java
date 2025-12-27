package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] myNumbers = readIntegers();
        System.out.println("My entered numbers are: " + Arrays.toString(myNumbers));

        int myMinNumber = findMin(myNumbers);
        System.out.println("My min number is: " + myMinNumber);

//        System.out.println("Array before reverse: " + Arrays.toString(myNumbers));
//        reverse(myNumbers);
//        System.out.println("Array after reverse: " + Arrays.toString(myNumbers));

        int[] reversedCopy = timReverseCopy(myNumbers);
        System.out.println("Array before reverse: " + Arrays.toString(myNumbers));
        System.out.println("Array after reverse: " + Arrays.toString(reversedCopy));

    }

    private static int[] readIntegers() {

        System.out.println("Write your integer numbers delimited by comma and press enter:");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(",");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }
        return numbers;
    }

    private static int findMin(int[] array) {

        int min = array[0];

        // alternative loop
//        for (int element : array) {
//            if (element < min) {
//                min = element;
//            }
//        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    private static void reverse(int[] array) {


        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private static void timReverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfIndex = array.length / 2;

        for (int i = 0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("---> " + Arrays.toString(array));
        }
    }

    private static int[] timReverseCopy(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }

        return reversedArray;
    }
}
