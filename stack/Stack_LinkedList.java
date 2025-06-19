
class Node {
    int data;
    Node next = null;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;

    }
}

public class Stack_LinkedList {

    Node head;

    public Stack_LinkedList() {
        this.head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int new_data) {
        Node new_Node = new Node(new_data);

        // if (new_Node == null) {
        // System.out.println("\nStack Overflow");
        // return;
        // }

        new_Node.next = head;
        head = new_Node;

    }

    void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        } else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }

    int peek() {
        if (!isEmpty()) {
            return head.data;
        } else {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {

        Stack_LinkedList st = new Stack_LinkedList();
        st.push(34);
        st.push(78);
        st.push(23);
        st.push(90);

        System.out.println("Top element is " + st.peek());

        System.out.println("Top element is " + st.peek());

        System.out.println("Pop the elelemt ");
        st.pop();
        st.pop();

        System.out.println("Top element is " + st.peek());

    }

}
