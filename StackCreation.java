package stackPrograms;


public class StackCreation {
    Node head;
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public int pop() {
        if (head == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }

        int poppedData = head.data;
        head = head.next;
        return poppedData;
    }
    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }

        return head.data;
    }
    public void printData() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackCreation stack = new StackCreation();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.printData();
        
        while (!(stack.head == null)) {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
        }
    }
}
