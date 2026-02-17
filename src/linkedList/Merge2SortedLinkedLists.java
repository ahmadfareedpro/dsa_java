package linkedList;

public class Merge2SortedLinkedLists {
    public static Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        Node dummy = new Node(-1);
        var curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 == null)
            curr.next = list2;
        else
            curr.next = list1;

        return dummy.next;
    }
}
