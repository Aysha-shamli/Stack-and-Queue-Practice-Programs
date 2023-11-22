package stackPrograms;


public class StackCreation {
    Node head;
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

    }
}
