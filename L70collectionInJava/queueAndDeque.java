package L70collectionInJava;

import java.util.*;

public class queueAndDeque {
    public static void main(String[] args){

        //queue is also created using linked list and array list
        
        // Queue<Integer>queue2=new LinkedList<>();
        //also create using arrayDeque
        Queue<Integer>queue2=new ArrayDeque<>();

        queue2.offer(5);
        queue2.offer(15);
        queue2.offer(25);
        queue2.offer(35);
        queue2.offer(45);

        //function which are implemented on queue
        System.out.println(queue2);
        System.out.println(queue2.poll());


        //implementing of Dequeue
        Deque<Integer>deque=new LinkedList<>();
        deque.add(5);
        deque.offer(55);
        deque.add(25);
        deque.pollLast();  //deleting last element from deque
        System.out.println(deque.peekFirst()); //see the last elment
        deque.offerFirst(85); //adding element in first position
        System.out.println(deque);


        //implementing of the priority queue
    }
}
