package linkedList;

public class RevLinkedList {
    public static Node revLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            var next = curr.next; // save next node
            curr.next = prev; // reverse the link
            prev= curr; // move prev to curr
            curr = next; // move curr to next
        }

        return prev;
    }
}
