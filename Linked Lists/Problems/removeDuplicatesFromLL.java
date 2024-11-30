import java.util.*;
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removeDuplicatesFromLL {
    static node head;

    public static node insert(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newnode;
        }
        return head;
    }

    public static node removeDuplicates(node head) { // works for sorted LL
        if (head == null || head.next == null)
            return head;

        node cur = head;
        while (cur != null && cur.next != null) {
            if (cur.data == cur.next.data) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static node removeDuplicatesSorted(node head) { // for unsorted LL
        if (head == null || head.next == null)
            return head;
        
        HashSet<Integer> set = new HashSet<>();
        node cur = head;
        node prev = null;
        while (cur != null) {
            if (set.contains(cur.data)) {
                prev.next = cur.next;
            } else {
                set.add(cur.data);
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
        
    }
    public static void main(String[] args) {
        int[] arr = { 2, 2, 4, 5 };
        for (int i : arr) {
            head = insert(i);
        }
        node res = removeDuplicates(head);
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        }
        System.out.println();

        int[] arr2 = { 2, 4, 2, 2, 5 };
        node head1=null;
        for (int i : arr2) {
            head1 = insert(i);
        }
        node res1 = removeDuplicatesSorted(head1);
        while (res1 != null) {
            System.out.print(res1.data + " ");
            res1 = res1.next;
        }
    }
}
