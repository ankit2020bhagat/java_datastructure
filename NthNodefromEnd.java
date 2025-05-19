class Node {

    int data;
    Node next;

    Node(int newdata) {
        data = newdata;
        next = null;
    }
}

public class NthNodefromEnd {

    static int NthNodeEnd(Node head, int key) {

        Node ref_head = head;
        Node main_head = head;

        for (int i = 0; i < key; i++) {
            ref_head = ref_head.next;

            if (ref_head == null) {
                return -1;
            }

        }

        while (ref_head != null) {
            ref_head = ref_head.next;
            main_head = main_head.next;
        }

        return main_head.data;

    }

    static void print(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(23);

        head.next = new Node(67);

        head.next.next = new Node(78);

        head.next.next.next = new Node(3);

        print(head);

        int data = NthNodeEnd(head, 2);
        System.out.println(data);
    }
}