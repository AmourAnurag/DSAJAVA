package L06andL7;

import java.util.Scanner;



public class L6 {
    public static void main(String[] args) {
        
        //take in input in java file via various way
        Scanner sc=new Scanner(System.in);  //sc is the objecy of scanner class and in is the object of inputstream class
        // System.out.println("Enter Your name : ");
        // String name=sc.next();
        // sc.nextLine();  //this is used because next() create buffer so it may be create program error
        // System.out.println("Enter your age :");
        // String age1=sc.next();
        // System.out.println("Enter your address:");
        // String address=sc.next();
        // System.out.println(
        //     "HI "+name+" Your age is "+age1+" And your address is "+address
        // );
     sc.close();

     //wrapper classes in javs
    //  int age=Integer.parseInt(age1);
    //  Integer ram=new Integer(12);
    //  Integer as=12;                //automatically converts primitives to their corresponding wrapper classes:
    //  System.out.println(age+ram+as); //45+12+12

    //operators in java
    int op=15;
    int ans=op++ + ++op - --op-op++;
    System.out.println(ans);

    //tild opertOR
    int tild=10;
    System.out.println(~tild); //-(tild+1)
    int tild1=-10;
    System.out.println(~tild1);  //-(tild+1)
    }
   

    
    
    
}
