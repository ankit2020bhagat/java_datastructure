class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class GetNthNode {

    static int GetNode(Node head, int key) {

        Node curr = head;
        int pos = 1;
        while (curr != null) {
            if (pos == key) {
                break;
            }
            pos++;
            curr = curr.next;
        }
        return curr.data;

    }

    static void print(Node head) {

        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(34);
        head.next = new Node(67);
        head.next.next = new Node(78);

        int data = GetNode(head, 2);
        System.out.println("data :" + data);

    }

}
