
import java.util.*;
/**
 * L9
 */
public class L9 {
  //in java a statcic method is called without creating an object of class but for calling non static method we need to create a object of class then call the function
    static void Show(){
       System.out.println("this is a static method");
    }
    void disply(){
        System.out.println("this is not a static method");
    }
    static void Show(String name){
       System.out.println("this is a static method "+name);
    }
    void disply(String name){
        System.out.println("this is not a static method "+name);
    }
    int num1=9;
    int num2=90;

    public static void main(String[] args) {
        Show();
        L9 obj=new L9();
        obj.disply();
       
        obj.swap(5, 8);
        System.out.println("before calling the function number are "+obj.num1+" "+obj.num2);
        
        obj.swapRef(obj);
        System.out.println("After calling the function number are "+obj.num1+" "+obj.num2);


        //concept of method over loading when we define same name of funtcion but arguments are different or datatype of argument are different
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=sc.nextLine();
        obj.disply(name);
        Show(name);
        sc.close();
    }

    //this function not swap number permanately because this passes formal parameter
    public void swap(int val1,int val2){
        int tmp=val1;
        val1=val2;
        val2=tmp;
        System.out.println("After swap the number are : "+val1+" "+val2);
    }

    //for swaping number permanatly we need to pass the reference of parameter
    public void swapRef(L9 obj){
        int tmp=obj.num1;
        obj.num1=obj.num2;
        obj.num2=tmp;
        // System.out.println("After swap the number are : "+num1+" "+num2);
    }
}