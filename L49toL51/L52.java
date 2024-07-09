package L49toL51;

import java.util.Scanner;

//Reversing the string

public class L52 {

    // first method of reversing the string
    static void reverse1(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans = str.charAt(i) + ans;
        }
        System.out.println(ans);
    }

    // second method of reversing the String thisrd methos is also available change the given string in to charArray then swap the character
    static void reverse2(String str) {
        StringBuilder ans = new StringBuilder(str);
        int n = ans.length();
        for (int i = 0; i < n / 2; i++) {
            char firstChar = ans.charAt(i);
            char lastChar = ans.charAt(n - 1 - i);
            ans.setCharAt(i, lastChar);
            ans.setCharAt(n - 1 - i, firstChar);
        }
        System.out.println(ans);
    }

    // *************************************  palindrome of string  *****************************************
     //first method by reversing the string 
     static void palindrome(String str) {
        StringBuilder ans = new StringBuilder(str);
        int n = ans.length();
        for (int i = 0; i < n / 2; i++) {
            char firstChar = ans.charAt(i);
            char lastChar = ans.charAt(n - 1 - i);
            ans.setCharAt(i, lastChar);
            ans.setCharAt(n - 1 - i, firstChar);
        }
        System.out.println(str.equals(ans.toString()));
    }

    //second way to check palindrome string
    static void palindrome2(String str){
        int start=0;
        int end=str.length()-1;
        while (start<end) {
            if (str.charAt(start)!=str.charAt(end)) {
                System.out.println("Not palindrome"); return ;
            }
            start++;
            end--;
        }
        System.out.println("Yes palindrome");
    }
    static void isPalindrome(String s) {
        String str[]=s.split("[! ,?._'@]+:");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length;i++){
            ans.append(str[i]);
        }
        System.out.println(ans.toString());
    }

    static double averageWaitingTime(int[][] customers) {
        int n =customers.length;
        int count=0;
        int minus=0;
        double avg=0;
        int sumOfWait=customers[0][0];
        for(int i=0;i<n;i++){
            // System.out.println(sumOfWait);
            count++;
            // for(int j=0 ; j<customers[i].length;j++){
                sumOfWait=sumOfWait+customers[i][1];
                if (sumOfWait<customers[i][0]) {
                    avg=avg+((customers[i][0]+customers[i][1])-customers[i][0]);
                    continue;
                }
                minus=sumOfWait-customers[i][0];
                avg=avg+minus;
                System.out.println(avg);
            
        }
        System.out.println(avg + " "+count);
        double average=(avg/count);
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String ");
        // String str = sc.next();

        int[][] customers = {{5,2},{5,4},{10,3},{20,1}};
        double avg=averageWaitingTime(customers);
        System.out.println(avg);
    }
}
