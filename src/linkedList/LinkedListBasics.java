package linkedList;

public class LinkedListBasics {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        var node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }

        Node newHead = RevLinkedList.revLinkedList(head);
        node = newHead;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
