package dev.lpa;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== TEST MyLinkedList =====");

        NodeList myList = new MyLinkedList(null);

        myList.addItem(new Node("Darwin"));
        myList.addItem(new Node("Auckland"));
        myList.addItem(new Node("Sydney"));
        myList.addItem(new Node("London"));
        myList.addItem(new Node("Berlin"));
        myList.addItem(new Node("Tokyo"));

        System.out.println("Traversing list:");
        myList.traverse(myList.getRoot());

        System.out.println("\nRemoving Sydney");
        myList.removeItem(new Node("Sydney"));
        myList.traverse(myList.getRoot());

        System.out.println("\nRemoving Auckland (root case)");
        myList.removeItem(new Node("Auckland"));
        myList.traverse(myList.getRoot());

        System.out.println("\n==============================\n");

        System.out.println("===== TEST SearchTree =====");

        NodeList tree = new SearchTree(null);

        tree.addItem(new Node("5"));
        tree.addItem(new Node("7"));
        tree.addItem(new Node("3"));
        tree.addItem(new Node("1"));
        tree.addItem(new Node("0"));
        tree.addItem(new Node("2"));
        tree.addItem(new Node("4"));
        tree.addItem(new Node("6"));
        tree.addItem(new Node("8"));
        tree.addItem(new Node("9"));

        System.out.println("Traversing tree (inorder):");
        tree.traverse(tree.getRoot());

        System.out.println("\nRemoving 3 (node with two children)");
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        System.out.println("\nRemoving 0 (leaf)");
        tree.removeItem(new Node("0"));
        tree.traverse(tree.getRoot());

        System.out.println("\nRemoving 5 (root)");
        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

    }
}
