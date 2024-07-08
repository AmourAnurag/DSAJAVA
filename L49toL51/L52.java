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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();
        reverse2(str);
    }
}
