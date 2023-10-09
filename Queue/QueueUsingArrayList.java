package Queue;

// importing ArrayList
import java.util.ArrayList;

public class QueueUsingArrayList{

    static ArrayList<Integer> arrList=new ArrayList<>();
    static int size=0;
    static int rear=-1;
    static int front=0;

    public boolean isEmpty(){
        return size==0;
    }

    public void enque(int data){
        arrList.add(data);
        size++;
        rear++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int val=arrList.remove(front);
        size--;
        return val;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        return arrList.get(front);
    }
    public static void main(String[] args) {
        QueueUsingArrayList q=new QueueUsingArrayList();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);

        System.out.println("Peeking the Queue "+q.peek());
        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }
        System.out.println(q.peek());
    }
}