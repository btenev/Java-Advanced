
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addLast(1);
        doublyLinkedList.addLast(2);
        doublyLinkedList.addLast(3);
        System.out.println(doublyLinkedList.removeLast());
        System.out.println(doublyLinkedList.removeLast());
        System.out.println(doublyLinkedList.removeLast());
        System.out.println(doublyLinkedList.removeLast());
    }
}