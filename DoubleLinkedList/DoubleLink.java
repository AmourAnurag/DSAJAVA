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
        obj.insertLast(82);
        obj.printList();
        obj.InsertStart(52);
        obj.printList();
        obj.insertSpecific(45,2);
        obj.printList();
        obj.insertSpecific(25,4);
        obj.printList();
        obj.deleteBegining();
        obj.printList();
        obj.deleteEnding();
        obj.printList();
        obj.deleteBegining();
        obj.printList();
        obj.deleteEnding();
        obj.printList();
        obj.insertLast(78);
        obj.insertSpecific(89,2 );
        obj.printList();
        obj.insertSpecific(39,1 );
        obj.printList();
        obj.insertSpecific(29,4 );
        obj.printList();
        obj.deleteSpecific(4);
        obj.printList();
        
    }

    // print the element os the linked list
    public void printList() {
        System.out.println("---------------------------");
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


    //insert the element at the specific position
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
        size++;
    }

    //deleting operation starts here

    //deleting from the last node
    public void deleteBegining(){
        if (head==null) {
            System.out.println("List is already empty so the delete operation is possible");
        }
        DoublyNode temp=head;
        head=temp.next;
        head.prev=null;
        System.out.println("Element is deleted "+temp.data);
        temp.next=null;
        size--;


    }

    //deleting last node of the Doublylinked list
    public void deleteEnding(){
        if (head==null) {
            System.out.println("List is already empty so deletion is not possible");
        }
        DoublyNode temp=head;
        DoublyNode current=head;

        while (temp.next!=null) {
            current=temp;
            temp=temp.next;
        }
        System.out.println("Deleted element is "+temp.data);
        current.next=null;
        size--;
    }

    //deleting from a specific position
    public void deleteSpecific(int position){
        if (position<0 || position>size) {
            System.out.println("You provided wrong position so deletion is not possible");
            return;
        }
        int counter=1;
        DoublyNode temp=head;
        DoublyNode previous=temp;
        while (counter<position) {
            previous=temp;
            temp=temp.next;
            counter++;
        }
        previous.next=temp.next;
        temp.next.prev=previous;
        System.out.println("Deleted element is "+temp.data);
        temp.next=null;
        temp.prev=null;
        size--;
    }

}
