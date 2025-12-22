package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] myArray = getRandomArray(10);
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);

        int[] desc = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            desc[i] = myArray[myArray.length - 1 - i];
        }

        System.out.println(Arrays.toString(desc));

    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
