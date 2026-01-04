package dev.lpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> groceryList = new ArrayList<>();



        boolean quit = false;

        System.out.println("Welcome to the interactive program!");

        while (!quit) {

            System.out.println("Press 1 to add any items (comma delimited list) " +
                    "press 2 to remove any items (comma delimited list) " +
                    "and press 0 to shutdown");

//            System.out.println("Your list is: " + groceryList);

            int choice = scanner.nextInt();

            switch(choice) {
                case 0 -> {
                    System.out.println("Goodbye!");
                        quit = true;
                }

                case 1 -> {
                    scanner.nextLine();
                    System.out.println("Enter items separated by commas:");
                    String inputAdd = scanner.nextLine();
                    String[] items = inputAdd.split(",");

                    for (String item : items) {
                        String cleaned = item.trim();
                        if (cleaned.isEmpty()) continue;

                        if (!groceryList.contains(cleaned)) {
                            groceryList.add(cleaned);
                        }
                    }

                    printedSortedList(groceryList);
                }

                case 2 -> {
                    scanner.nextLine();
                    System.out.println("Enter items which you want to remove by commas");
                    String inputRemove = scanner.nextLine();
                    String[] items = inputRemove.split(",");

                    for (String item : items) {
                        String cleaned = item.trim();
                        if (cleaned.isEmpty()) continue;

                        while (groceryList.remove(cleaned)) {
                            // keep removing until none left
                        }
                    }

                    printedSortedList(groceryList);
                }

                default -> System.out.println("Invalid choice");
            }
        }

    }

    private static void printedSortedList(ArrayList<String> list) {
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}
