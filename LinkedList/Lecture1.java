package LinkedList;


public class Lecture1 {
    class Node{
        Node next;
        int data;
        Node(){
            this.next=null;
        }
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }
    Node head;
    int size;
    Lecture1(){
        this.head=null;
        this.size=0;
    }
    public static void main(String[] args){
     Lecture1 obj=new Lecture1();
     obj.InsertBegin(45);
     obj.printList();
     obj.InsertBegin(78);
     obj.printList();
     obj.InsertSpecific(98,1);
     obj.printList();
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println("data is -> "+temp.data);
            temp=temp.next;
        }
    }

    public void InsertBegin(int data){
         Node newNode=new Node(data);
         if (head==null) {
            head=newNode;
            size++;
            System.out.println("Inserted at begining");
            return;
         }
         newNode.next=head;
         head=newNode;
         size++;
         System.out.println("data is inserted at begining");

    }


    public void InsertTail(int data){
        Node newNode=new Node(data);
        if (head==null) {
            size++;
            head=newNode;
            System.out.println("Inserted at backward");
            return;
         }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
        System.out.println("Data is inserted backward");
    }

    public void InsertSpecific(int data , int position){
          if (position<0 || size<position) {
            System.out.println("Wrong input");
            return;
          }
          Node newNode=new Node(data);
          Node temp=head;
          int counter=0;
          while (counter<position-1) {
            temp=temp.next;
            counter++;
          }
          newNode.next=temp.next;
          temp.next=newNode;
          size++;
          System.out.println("data is added");
    }
   
}

