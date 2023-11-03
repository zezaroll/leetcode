package abstractclass49;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    void setNext(ListItem listItem) {
        this.rightLink = listItem;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    void setPrevious(ListItem listItem) {
        this.leftLink = listItem;
    }

    @Override
    int compareTo(ListItem listItem) {
        return Integer.compare((int) this.value, (int) listItem.value);
    }
}