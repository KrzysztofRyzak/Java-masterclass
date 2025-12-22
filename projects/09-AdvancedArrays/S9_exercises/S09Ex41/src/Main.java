import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = getIntegers(5);

        System.out.println("Original array ref: " + System.identityHashCode(numbers));
        printArray(numbers);

        int[] sortedDesc = sortIntegers(numbers);

        System.out.println("After sortIntegers, original ref: " + System.identityHashCode(numbers));
        System.out.println("Sorted array ref: " + System.identityHashCode(sortedDesc));

        System.out.println("Original after Arrays.sort (changed in-place): " + Arrays.toString(numbers));
        System.out.println("Sorted (desc copy): " + Arrays.toString(sortedDesc));
    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[size];
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < size; i++) {
            System.out.println("Enter your number to the array:");
            myArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(myArray));
        return myArray;

    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        Arrays.sort(unsortedArray);

        int[] desc = new int[unsortedArray.length];
        for (int i = 0; i < unsortedArray.length; i++) {
            desc[i] = unsortedArray[unsortedArray.length - 1 - i];
        }
        return desc;
    }

}
