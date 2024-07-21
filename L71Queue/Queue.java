package L71Queue;

public class Queue {
    int front;
    int rear;
    int size;
    int capacity;
    int[] queue;

    public Queue(int capacity) {
        queue = new int[capacity];
        this.capacity = capacity;
        front = rear = -1;
        size = 0;

    }

    boolean isEmpty() {
        if (front == -1) {
            System.out.println("Queue is empty ");
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (rear == (capacity - 1)) {
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    void insert(int val) {
        if (isFull()) {
            return;
        }
        front=0;
        rear += 1;
        System.out.println("Insert at the position " + rear);
        queue[rear] = val;
        size++;
    }

    void delete() {
        if (isEmpty()) {
            return;
        }
        
        System.out.println("Delete from the position " + front++);
        if (front==rear) {
            front=rear=-1;
        }
        size--;

    }

    public static void main(String[] args) {
      Queue myqueue=new Queue(5);
     
      myqueue.insert(6);
      myqueue.insert(7);
      myqueue.insert(9);
      myqueue.insert(10);
      myqueue.insert(10);
      myqueue.delete();
      myqueue.delete();
      myqueue.delete();
      myqueue.delete();
      myqueue.delete();
      myqueue.insert(10);

      myqueue.isEmpty();
    }
}
