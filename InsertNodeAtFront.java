class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class InsertNodeAtFront {

    static Node insertNode(Node head, int newData) {

        Node newNode = new Node(newData);

        newNode.next = head;

        return newNode;

    }

    static void insertNodeatposition(Node head, int newdata, int key) {

        Node newNode = new Node(newdata);

        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                break;
            }
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

    }

    static void print(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;

        }
    }

    public static void main(String[] args) {

        Node head = new Node(23);
        head.next = new Node(45);
        head.next.next = new Node(65);

        head = insertNode(head, 76);

        insertNodeatposition(head, 90, 45);
        print(head);
    }

}
