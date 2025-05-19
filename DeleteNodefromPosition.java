class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class DeleteNodefromPosition {

    static void deleteNodefromPosition(Node head, int position) {
        Node curr = head;
        Node pre = null;

        int key = 1;

        while (curr != null) {
            if (position == key) {
                break;
            }

            pre = curr;
            curr = curr.next;
            key++;
        }

        pre.next = curr.next;

        curr = null;

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
        head.next = new Node(65);
        head.next.next = new Node(78);

        deleteNodefromPosition(head, 2);
        print(head);

    }
}
