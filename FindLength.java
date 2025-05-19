
class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;

    }
}

public class FindLength {
    public static int countNode(Node head) {
        int count = 0;

        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;

    }

    public static void main(String[] args) {
        Node head = new Node(1);

        head.next = new Node(2);

        head.next.next = new Node(3);

        System.out.println(countNode(head));
    }

}
