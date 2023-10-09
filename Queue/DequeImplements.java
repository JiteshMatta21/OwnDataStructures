package Queue;

public class DequeImplements {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head;
    static Node tail;

    
    static class DequeLL{
        public boolean isEmpty(){
            return head==null && tail==null;
        }

        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
            }
            newNode.next=head;
            head=newNode;
        }

        public void addLast(int data){
            if(head==null){
                addFirst(data);
            }
            Node newNode=new Node(data);
            tail.next=newNode;
            tail=newNode;
        }

        public int removeFirst(){
            if(isEmpty()){
                System.out.println("LinkedList is Empty");
                return -1;
            }
            int val=head.data;
            if(head==tail){   
                head=tail=null;
            }
            else{
                head=head.next;
            }
            return val;
        }

        public int removeLast(){
            if(isEmpty()){
                System.out.println("LinkedList is Empty");
                return -1;
            }
            Node temp=head;
            int val=tail.data;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            return val;
        }

        public int peekFirst(){
            if(head==null){
                System.out.println("LinkedList is Empty");
                return -1;
            }
            return head.data;
        }

        public int peekLast(){
            if(head==null){
                System.out.println("LinkedList is Empty");
                return -1;
            }
            return tail.data;
        }

    }

    public static void main(String[] args) {
        DequeLL dq=new DequeLL();
        dq.addFirst(3);
        System.out.println(dq.peekFirst());
        dq.addFirst(2);
        dq.addFirst(1);
        System.out.println(dq.peekFirst());
        dq.addLast(4);
        dq.addLast(5);

        System.out.println(dq.removeFirst());
        /*using remove last function
        while(!dq.isEmpty()){
            System.out.println(dq.removeLast());
            System.out.println("peek last "+dq.peekLast());
        }
        */

        // using remove from first function
        while(!dq.isEmpty()){
            System.out.println(dq.removeFirst());
            System.out.println("Peek first "+dq.peekFirst());
        }

    }
}
