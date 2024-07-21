package L71Queue;

public class CircularQueue {
    int front;
    int rear;
    int size;
    int capacity;
    int circularQueue[];

    public CircularQueue(int capacity) {
        circularQueue = new int[capacity];
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
        if (front == (rear + 1) % capacity) {
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    void insert(int val) {
        if (isFull()) {
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        System.out.println("Insert at the position " + rear);
        circularQueue[rear] = val;
        size++;
    }

    void delete() {
        if (isEmpty()) {
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            System.out.println("Element is deleted from the position "+front);
            front = (front + 1) % capacity;
        }
        size--;

    }

    void PrintCircularQueue() {
        if (isEmpty()) {
            return;
        }
        System.out.println("Size of the queue is "+size);
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(circularQueue[i] + " ");
            }
        } else {
            for (int i = front; i < capacity; i++) {
                System.out.print(circularQueue[i] + " ");
            } for (int i = 0; i <= rear; i++) {
                System.out.print(circularQueue[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(6);
        cq.insert(15);
        cq.insert(25);
        cq.insert(35);
        cq.insert(75);
        cq.insert(55);
        cq.delete();
        cq.delete();
        cq.insert(25);
        cq.delete();
        cq.insert(89);
        cq.insert(39);
        cq.insert(9);
        cq.insert(9);
        cq.delete();
        cq.delete();
        cq.delete();
        cq.delete();
        cq.delete();
        cq.delete();
        cq.delete();
        cq.delete();
        cq.PrintCircularQueue();
    }
}
