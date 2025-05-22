
class Node {
    int data;
    Node next;

    Node(int newdata) {
        data = newdata;
        next = null;
    }
}

public class Circular_list {

    static int checkCircularList(Node head) {

        Node curr = head;
        int count = 1;
        do {
            curr = curr.next;
            count += 1;
            if (curr == head) {
                return count;
            }
        } while (curr != head && curr != null);

        return -1;

    }

    public static void main(String[] args) {
        Node head = new Node(45);
        head.next = new Node(56);
        head.next.next = new Node(78);
        head.next.next.next = new Node(90);
        head.next.next.next.next = head;

        int check = checkCircularList(head);
        System.out.println(check);
    }

}
