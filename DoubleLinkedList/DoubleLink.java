package DoubleLinkedList;

public class DoubleLink {
    class DoublyNode {
        DoublyNode next;
        DoublyNode prev;
        int data;

       

        DoublyNode(int data) {
            this.next = null;
            this.prev = null;
            this.data = data;
        }
    }

    DoublyNode head;
    int size;

    DoubleLink() {
        this.head = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        DoubleLink obj = new DoubleLink();
        obj.InsertStart(85);
        obj.printList();
        obj.insertLast(852);
        obj.printList();
        obj.InsertStart(52);
        obj.printList();
    }

    // print the element os the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty ");
            return;
        }
        DoublyNode temp = head;
        while (temp != null) {
            System.out.println("data is -> " + temp.data);
            // System.out.println("previous data " + temp.prev.data);
            temp = temp.next;
        }
    }

    // inserted element at the starting of the linked list
    public void InsertStart(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            size++;
            System.out.println("Element is inserted at begining ");
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;

    }

    // inserteed the element at the end os the linked list
    public void insertLast(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            size++;
            System.out.println("Element is inserted at begining ");
            return;
        }
        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }

    public void insertSpecific(int data, int position){
        DoublyNode newNode=new DoublyNode(data);
        if (position<0 || position>size) {
            System.out.println("Wrong input ");
            return;
        }
        int counter=1;
        DoublyNode temp=head;
      
        while (counter<position-1) {     
            temp=temp.next;
            counter++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.prev=temp;
    }

}
