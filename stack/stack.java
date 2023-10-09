package stack;
import java.util.ArrayList;

public class stack{

    // implemented by arrList
    static class StackimplementsArr{
        static ArrayList<Integer> list=new ArrayList<>();

        static boolean isEmpty(){
            return list.size()==0;
        }

        // push data
        static void push(int data){
            list.add(data);
        }

        static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            return list.remove(list.size()-1);
        }

        static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    // implements by linkedList
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class StackimplementsLL{
        static Node head=null;

        static boolean isEmpty(){
            return head==null;
        }
        
        static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
            return;
        }

        static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        static int peek(){
            if(isEmpty()){return -1;}
            return head.data;
        }
    }

    public static void main(String[] args) {
        System.out.println("Stack by linkedlist: ");
        StackimplementsArr s=new StackimplementsArr();
        s.push(5);
        s.push(4);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            System.out.println(s.pop());
        }

        System.out.println("Stack by linkedlist: ");
        StackimplementsLL s1= new StackimplementsLL();
        s1.push(5);
        s1.push(4);
        s1.push(3);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            System.out.println(s1.pop());
        }
    }
}