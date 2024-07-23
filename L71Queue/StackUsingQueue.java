package L71Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
     
    Queue<Integer> queue=new LinkedList<>();
    Queue<Integer> queue1=new LinkedList<>();
   
    void insert(int val){
        while (!queue.isEmpty()) {
            queue1.offer(queue.poll());
        }
        queue.offer(val);
        while (!queue1.isEmpty()) {
            queue.offer(queue1.poll());
        }
    }

    int delete(){
        return queue.poll();
    }
    public static void main(String []args){
          StackUsingQueue sq=new StackUsingQueue();
          sq.insert(5);
          sq.insert(8);
          sq.insert(9);
          sq.insert(4);
          System.out.println(sq.delete()+" "+sq.delete());
    }
}
