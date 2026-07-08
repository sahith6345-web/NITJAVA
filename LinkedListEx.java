class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertAtBegining(int data){
        Node newNode=new Node(data);
        head =newNode;
    }
    public void insertAtEnd(int data){
        Node newNode= new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public boolean search (int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data) return true;
            temp=temp.next;
        }
        return false;
    }
}
public class LinkedListEx {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list. insertAtBegining(30);
        list. insertAtBegining(40);
        list. insertAtBegining(20);
        list.insertAtEnd(40);
        System.out.println(list.search(20));

        
    // Node first=new Node(10);
    // Node second=new Node(20);
    // Node third=new Node(30);
    // System.out.println(first.next);
    // first.next = second;
    // second.next=third;
    // Node temp=first;

    Node temp =list.head;
    while(temp!=null){
        System.out.println(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("Null");
    }
}