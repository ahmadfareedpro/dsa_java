package linkedList;

public class LinkedListBasics {

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        var node = head;
        while(node != null) {
        System.out.println(node.value);
        node = node.next;
        }

        var newHead = revLinkedList(head);
        node = newHead;
        while(node != null) {
        System.out.println(node.value);
        node = node.next;
        }
    }
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

    public boolean hasCycle(Node head) {
        if (head == null || head.next == null)
            return false;
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }
}
