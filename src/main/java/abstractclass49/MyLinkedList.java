package abstractclass49;

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
        if (root == null) {
            root = newItem;
            return true;
        }
        ListItem listItem = root;
        while (listItem != null) {
            int compared = listItem.compareTo(newItem);
            if (compared < 0) {
                if (listItem.next() != null) {
                    listItem = listItem.next();
                } else {
                    listItem.setNext(newItem);
                    newItem.setPrevious(listItem);
                    return true;
                }
            }
            if (compared > 0) {
                if (listItem.previous() != null) {
                    ListItem previous = listItem.previous();
                    previous.setNext(newItem);
                    listItem.setPrevious(newItem);
                    newItem.setPrevious(previous);
                    newItem.setNext(listItem);
                } else {
                    newItem.setNext(root);
                    root.setPrevious(newItem);
                    root = newItem;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("the list is empty");
        }
    }
}