package dev.lpa;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (newItem == null) {
            return false;
        }

        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem currentItem = root;

        while (currentItem != null) {

            int comparison = currentItem.compareTo(newItem);

            if (comparison < 0) {
                //newItem jest większy -> idziemy w prawo
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // doszliśmy na koniec -> wstawiamy na końcu
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //newItem jest mniejszy -> idziemy w lewo (stawiamy przed currentItem)
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                } else {
                    // wstawiamy na początek -> zmiana root
                    root = newItem;
                }

                newItem.setNext(currentItem);
                currentItem.setPrevious(newItem);
                return true;
            } else {
                // comparison == 0 -> duplikat
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { // comparison > 0
                // we are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        // we have reached the end of the list
        // without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
