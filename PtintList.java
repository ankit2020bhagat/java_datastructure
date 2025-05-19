
class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class PtintList {

    static void printfunction(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;

        }
    }

    public static void main(String[] args) {
        Node head = new Node(23);
        head.next = new Node(45);
        head.next.next = new Node(45);

        printfunction(head);
    }

}
