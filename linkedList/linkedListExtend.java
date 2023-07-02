package linkedList;


public class linkedListExtend extends linkedList{
    public static boolean containsEle(int key){
        if(head==null){
            return false;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public static void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            // update
            prev=curr;
            curr=temp;

        }
        head.next=null;
        head=prev;
    }

    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static boolean isPallindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid=findMid(head);
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static int removeMid(Node head){
        Node mid=findMid(head);
        Node temp=head;
        while(temp.next!=mid){
            temp=temp.next;
        }
        temp.next=mid.next;
        return mid.data;
    }

    public static boolean detectCycle(Node head){
        if(head==null || head.next==null){
            return false;
        }

        Node slow,fast;
        slow=fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        linkedList ll1=new linkedListExtend();
        ll1.insertEleAtHead(1);
        ll1.insertEleAtTail(2);
        ll1.insertEleAtTail(3);
        ll1.insertEleAtTail(4);
        ll1.insertEleAtTail(3);
        ll1.insertEleAtTail(2);
        ll1.insertEleAtTail(1);
        int key=1;
        reverse();
        ll1.printLL();
        System.out.println(containsEle(key));
        
        System.out.println(removeMid(head));

        System.out.println(findMid(head).data);

        System.out.println(isPallindrome());

        System.out.println(detectCycle(head));
    }

}
