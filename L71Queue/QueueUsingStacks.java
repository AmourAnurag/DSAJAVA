package L71Queue;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void insert(int val) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(val);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    
    int delete(){
       return stack1.pop();
    }
    public static void main(String[] args) {
        QueueUsingStacks qs=new QueueUsingStacks();

        qs.insert(5);
        qs.insert(3);
        qs.insert(2);
        System.out.println(qs.delete()+" "+qs.delete()+" "+qs.delete());
    }
}
