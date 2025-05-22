class Node {
    int data;
    Node next;

    Node(int newdata) {
        data = newdata;
        Node next = null;
    }
}

public class TraversalofCircular {

    static void circularTraversal(Node head) {

        Node curr = head;

        do {
            System.out.println(curr.data + " ");
            curr = curr.next;
        } while (curr != head);

    }

    public static void main(String[] args) {
        Node head = new Node(34);
        head.next = new Node(67);
        head.next.next = new Node(56);
        head.next.next.next = new Node(23);
        head.next.next.next.next = head;

        circularTraversal(head);

    }

}
