class Stack {
    int top, cap;
    int[] a;

    public Stack(int cap) {
        this.cap = cap;
        top = -1;
        a = new int[cap];
    }

    public boolean push(int x) {

        if (top == cap - 1) {
            System.err.println("Stack is over flow");
            return false;
        }

        a[++top] = x;
        return true;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("stack is empty");
            return -1;
        }
        return a[top--];
    }

    public int peak() {
        if (top == -1) {
            System.out.println("stack is empty");
            return -1;
        }
        return a[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }
}

public class Stack_using {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(3);
        s.push(1);
        s.push(9);
        s.push(10);
        System.out.println(s.pop() + " popped from stack");
        System.out.println(s.peak() + "Top element is");
        System.out.println("Element present in stack ");
        while (!s.isEmpty()) {
            System.out.println(s.peak() + " ");
            s.pop();
        }
    }

}
