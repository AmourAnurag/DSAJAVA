package L71Queue;

public class DoubleEnded {
    int front;
    int rear;
    int size;
    int capacity;
    int doubleQueue[];

    public DoubleEnded(int capacity) {
        doubleQueue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        front = rear = 0;

    }

    boolean isEmpty() {
        if (front == -1) {
            System.out.println("Queue is empty ");
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (front == 0 && rear == capacity - 1) {
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    void insertFront(int val) {
        if (isFull()) {
            return;
        } else {
            if (front == 0 && rear != capacity - 1) {
                for (int i = rear; i >= front; i--) {
                    doubleQueue[i + 1] = doubleQueue[i];

                }
                doubleQueue[front] = val;
                rear++;

            } else {
                front = front - 1;
                doubleQueue[front] = val;
            }
        }
    }
    void insertRear(int val){
        if (isFull()) {
            return;
        }else{
            if (front!=0 && rear==capacity-1) {
                for(int i=front;i<=rear;i++){
                    doubleQueue[i-1]=doubleQueue[i];
                }
                doubleQueue[rear]=val;
                front--;
            }else{
                doubleQueue[rear++]=val;
            }
        }
    }
   
    void deleteFront(){
        
    }

    public static void main(String []args){
       
    }
}
