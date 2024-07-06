package L49toL51;

import java.util.Scanner;

public class L50 {
    public static void main(String args[]){
        //concept of string formating
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the first word ");
        // String word=sc.next();
        // System.out.println("Enter the second word ");
        // String word1=sc.next();
        // System.out.println("Enter the first line ");
        // sc.nextLine();
        // String line=sc.nextLine();
        // System.out.println("Enter the second line ");
        // String line1=sc.nextLine();

        // System.out.println("First word "+word);
        // System.out.println("Second word "+word1);
        // System.out.println("First line "+line);
        // System.out.println("Secon line "+line1)  ;      


        //concatnation of strings when we add string with integer double it convert in to string
        // System.out.println("Ram is a "+56);
        // System.out.println(45+" you are");
        // System.out.println((45+96)+" gentleman");
        // System.out.println(" gentleman"+45+96);
        // System.out.println(" gentleman"+(45+96));



        //string formatting 
        int rollNum=8569;

        String name="Ram";
        System.out.println(name);
        String data=String.format("Name is %2$s and age is %1$d", rollNum,name);
        System.out.println(data);
        SubString(name);
        
    }

    static void SubString(String str){
        int n=str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=n; j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
