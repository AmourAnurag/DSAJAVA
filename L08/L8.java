package L08;
//this file consists of control flow statement


//if else statement

import java.util.Scanner;

/**
 * L8
 */
public class L8 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        //single if else statement
        // System.out.println("Please enter your age :");
        // int age=sc.nextInt();
        // if(age>=18) System.out.println("You can vote ");
        // else System.out.println("You cannot vote");

        //if ladder
        System.out.println("Enter your marks for check the grade");
        int marks=sc.nextInt();
        // if(marks>=90) System.out.println("You got the grade A");
        // if(marks>=75) System.out.println("You got the grade B");
        // if(marks>=60) System.out.println("You got the grade C");
        // if(marks>=45) System.out.println("You got the grade D");

        //if else ladder
        //  if (marks>90) {
        //     System.out.println("You got the grade A");
        //  } else if(marks>75) {
        //     System.out.println("You got the grade C");
        //  }else{
        //     System.out.println("you failed try again");
        //  }

        //Switch statement
        // System.out.println("Enter your choice ");
        // int ch=sc.nextInt();
        // switch (ch) {
        //     case 1: System.out.println("You choose the "+ch);break;
        //     case 2: System.out.println("You choose the "+ch);break;
        //     case 3: System.out.println("You choose the "+ch);break;
        //     default: System.out.println("choose right choice");  break;
        
        // }

        //Loop statement
        //IN JAVA THERE ARE FOUR TYPE OF LOOP AVAILABLE 
        // 1 fOR LOOP   2 FOREACH LOOP   3 WHILE LOOP  4  DO WHILE LOOP
        // for (int index = 0; index < 8; index++) {
        //     if (index%2==0) {
        //         System.out.println(index);
        //     }
        // }
        int arr[]={2,5,6,9,8,7,12};
        // for (int i : arr) {
        //     if (i%3==0) {
        //         System.out.println(i);
        //     }
        // }

        //PERHAPS YOU KNOW THE USE OF WHILE AND DO WHILE LOOP
        //JUMP STATEMENT ALSO INCLUDEDE IN THIS LECTURE
        //THERE ARE ONLY TWO JUMP STATEMENT AVAILABLE I JAVA 
        // BREAK STATEMENT AND CONTINUE STATEMENT   BOTH ARE USED INSIDE THE LOOP OR SWICTH CASE STATEMENT
        sc.close();
    }
}