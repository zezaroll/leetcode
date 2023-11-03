package abstractclass49;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();

    abstract void setNext(ListItem listItem);

    abstract ListItem previous();

    abstract void setPrevious(ListItem listItem);

    abstract int compareTo(ListItem listItem);

    void setValue(Object value) {
        this.value = value;
    }

    Object getValue() {
        return this.value;
    }
}