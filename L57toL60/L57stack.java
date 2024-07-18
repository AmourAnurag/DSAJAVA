

import java.util.*;

public class L57stack {
    int stack[];
    int size;
    int top;

    public void MyStack(int stackSize){
        stack=new int[stackSize];
        size=stackSize;
        top=-1;
    }

    // for inserting the element
    public void push(int element) {
       if (top>=size-1) {
        System.out.println("Stack is full - overflow condition");
        return ;
       }
       top++;
       stack[top]=element;
    }

    //checking stack is empty or full
    public boolean isEmpty(){
        return top<=-1;
    }

    //size of the stack
    public int size(){
        System.out.println(top);
        top++;
        System.out.println(top);
        return top;

    }

    //peek the element from the stack
    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is already emptty");
            return Integer.MIN_VALUE;
        }
      return stack[top];
    }

    //pop the element from the stack
    public int pop(){
        int val=peek();
        if (val!=Integer.MIN_VALUE) {
            top--;
        }
        return val;
    }

    //printing the element of the stack
    public void PrintStack(){
        System.out.println("Printitng the stack");
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
    }
    public static void main(String []args){
        int n=5;
        L57stack stack=new L57stack();
        stack.MyStack(n);
        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(7);
        stack.push(3);
        stack.push(2);
        stack.PrintStack();
        stack.peek();
        stack.PrintStack();
        stack.pop();
        stack.PrintStack();
        stack.size();
        stack.push(3);
        stack.push(2);
        stack.PrintStack();
        stack.size();
    }
}
