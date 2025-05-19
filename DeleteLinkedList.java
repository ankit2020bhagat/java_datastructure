class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class DeleteLinkedList {

    static Node deleteNode(Node head) {
        Node curr = head;

        while (curr != null) {
            head = head.next;
            curr = null;
            curr = head;
        }
        return curr;
    }

    static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(23);
        head.next = new Node(67);
        head.next.next = new Node(78);
        head = deleteNode(head);
        print(head);
    }

}
