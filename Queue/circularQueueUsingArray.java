package Queue;

public class circularQueueUsingArray {
    static int arr[];
    static int size;
    static int front;
    static int rear;

    circularQueueUsingArray(int n){
        arr=new int[n];
        size=n;
        front=rear=-1;
    }

    public boolean isEmpty(){
        return rear ==-1 && front==-1;
    }

    public boolean isFull(){
        return (rear+1)%size==front;
    }

    public void enque(int data){
        if(isFull()){
            System.out.println("Overflow Queue");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Underflow Queue");
            return -1;
        }
        int result=arr[front];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%size;
        }
        return result;
    }
    
    public static void main(String[] args) {
        circularQueueUsingArray q=new circularQueueUsingArray(4);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        System.out.println(q.dequeue());
        q.enque(4);
        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }
        q.enque(6);
        q.enque(7);
        q.enque(8);
        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }
    }
}
