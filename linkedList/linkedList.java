package linkedList;

public class linkedList{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public boolean isLlEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }

    public void insertEleAtHead(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void insertEleAtTail(int data){
        if(head==null){
            insertEleAtHead(data);
            return;
        }
        size++;
        Node newNode=new Node(data);
        tail.next=newNode;
        tail=newNode;
    }

    public int deleteEleAtHead(){
        if(size==0){
            System.out.print("(LinkedList is empty!)");
            return -1;
        }
        else if(size==1){
            int delNodeVal=head.data;
            size=0;
            head=tail=null;
            return delNodeVal;
        }
        int delNodeVal=head.data;
        size--;
        head=head.next;
        return delNodeVal;
    }

    public int deleteEleAtTail(){
        if(size==0){
            System.out.print("(LinkedList is empty!)");
            return -1;
        }
        else if(size==1){
            int delNodeVal=head.data;
            head=tail=null;
            size=0;
            return delNodeVal;
        }
        Node temp=head;
        int i=0;
        while(i!=size-1){
            temp=temp.next;
            i++;
        }
        int delNodeVal=temp.data;
        size--;
        temp.next=null;
        tail=temp;
        return delNodeVal;
    }

    public void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.insertEleAtHead(2);
        ll.insertEleAtTail(3);
        ll.insertEleAtTail(4);
        ll.insertEleAtTail(5);
        ll.insertEleAtTail(6);
        ll.insertEleAtHead(1);

        ll.printLL();

        // ll.deleteEleAtHead();
        // while(ll.isLlEmpty()){
        //     System.out.print(ll.deleteEleAtTail()+"->");
        // }
        // System.out.println("null");
        
        // System.out.print(ll.deleteEleAtTail()+"->");
        // System.out.print(ll.deleteEleAtTail()+"->");
        // System.out.print(ll.deleteEleAtTail()+"->");
        // System.out.print(ll.deleteEleAtTail()+"->");
        // System.out.print(ll.deleteEleAtTail()+"->");
        // System.out.print(ll.deleteEleAtTail()+"->");

        while(!ll.isLlEmpty()){
            System.out.print(ll.deleteEleAtTail()+"->");
        }

        System.out.println();
    }
}