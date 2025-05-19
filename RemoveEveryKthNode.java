
class Node {
    int data;
    Node next;

    Node(int newdata) {
        data = newdata;
        next = null;
    }
}

public class RemoveEveryKthNode {
    static void RemoveNode(Node head, int key) {
        Node curr = head;
        Node pre = head;
        int count = 1;
        while (curr != null) {
            if (count % key == 0) {
                pre.next = curr.next;
                count += 1;
            }
            pre = curr;
            curr = curr.next;
            count += 1;
        }

    }

    static void print(Node head) {

        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(43);
        head.next = new Node(78);
        head.next.next = new Node(67);

        head.next.next.next = new Node(89);

        RemoveNode(head, 2);
        print(head);
    }
}
