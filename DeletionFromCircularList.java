class Node {
    int data;
    Node next;

    Node(int newdata) {
        data = newdata;
        next = null;
    }
}

public class DeletionFromCircularList {
    static Node deleteFrombeginging(Node head) {
        Node curr = head;

        do {
            curr = curr.next;
        } while (curr != head);

        curr.next = curr.next.next;

        return curr.next;
    }

    static void print(Node head) {

        Node curr = head;

        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);
    }

    public static void main(String[] args) {
        Node head = new Node(34);
        head.next = new Node(67);
        head.next.next = new Node(89);
        head.next.next.next = new Node(23);
        head.next.next.next.next = head;
        head = deleteFrombeginging(head);

        print(head);

    }
}
