package Queue;

public class QueueUsingLL{
    
    // using inkedlist
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void enque(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int dequeue() {
        if (head == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return val;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.data;
    }
    

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);

        System.out.println("Peeking the Queue "+q.peek());
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
        System.out.println(q.peek());
    }
}
