package Queue;

import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2=new Stack<>();

    public boolean isEmpty(){
        return st1.isEmpty() && st2.isEmpty();
    }

    /* Enque in O(1)
    public void enque(int data){
        st1.push(data);
    }
    
    // Dequeue in O(n)
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int result=st2.pop();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return result;
    }
    
    // Peek in O(n)
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int result=st2.peek();
        st1.push(st2.pop());
        
        return result;
    }
    */

    // O(n)
    public void enque(int data){
        if(isEmpty()){
            st1.push(data);
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(data);

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    public int dequeue(){ //O(1)
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return st1.pop();
    }

    public int peek(){ //O(1)
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return st1.peek();
    }

    public static void main(String[] args) {
        QueueUsingStack q=new QueueUsingStack();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);

        System.out.println("Peeking the Queue "+q.peek());
        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }
        System.out.println(q.peek());
    }
}
