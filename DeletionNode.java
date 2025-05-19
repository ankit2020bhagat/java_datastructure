
class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class DeletionNode {

    static Node deleteNode(Node head) {
        Node curr = head;

        head = head.next;
        curr = null;

        return head;

    }

    static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(34);
        head.next = new Node(45);
        head.next.next = new Node(67);

        head = deleteNode(head);

        print(head);

    }

}
