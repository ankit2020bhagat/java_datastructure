
class Node {
    int data;
    Node next;

    Node(int newdata) {
        data = newdata;
        next = null;
    }
}

public class FindMiddleOfList {
    static int findmiddle(Node head) {

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(45);
        head.next = new Node(65);
        head.next.next = new Node(67);

        int data = findmiddle(head);
        System.out.println(data);
    }
}
