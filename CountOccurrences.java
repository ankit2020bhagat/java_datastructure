
class Node {

    int data;
    Node next;

    Node(int newdata) {
        data = newdata;
        next = null;
    }
}

public class CountOccurrences {

    static int countOccurece(Node head, int key) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (curr.data == key) {
                count += 1;
            }
            curr = curr.next;
        }

        return count;
    }

    static void print(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;

        }
    }

    public static void main(String[] args) {
        Node head = new Node(56);
        head.next = new Node(78);

        head.next.next = new Node(78);

        print(head);
        int result = countOccurece(head, 78);
        System.out.println(result);
    }

}
