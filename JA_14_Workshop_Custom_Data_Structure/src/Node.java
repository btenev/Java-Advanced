public class Node {
    public int value;
    public Node next;
    public Node prev; // used for DoublyLinkedList
    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
