package L12;

import java.util.*;

public class Program {
    void Armstrong(int num) {
        int res = num;
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum += (rem * rem * rem);
            num /= 10;
        }
        if (sum == res) {
            System.out.println("Number is Armstrong");
            return;
        }
        System.out.println("nummber is not armstrong");

    }

    void Prime(int num) {

        int i = 2, count = 0;
        while (i < num) {
            if (num % i == 0)
                count++;
            i++;
        }
        if (count > 0)
            System.out.println("Number is not Prime");
        else
            System.out.println("Number is prime");
    }

    void RangePrime(int lstart, int lend) {
        while (lstart < lend) {
            int i = 2, count = 1;
            while (i <= (lstart / 2 + 1)) {
                if (lstart % i == 0) {
                    count = 0;
                    break;
                }
                i++;
            }
            if (count > 0) {
                System.out.print(" " + lstart);
                count = 0;
            }
            lstart++;
        }
    }

    int GCD(int num1, int num2) {
        int min, max;
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        min = (Math.min(num2 % num1, num1));
        max = (Math.max(num2 % num1, num1));
        if (min == 0)
            return num1;
        return GCD(min, max);
    }

    void LCM(int num1,int num2){
        int res=(num1*num2)/GCD(num1, num2);
        System.out.println(res);
    }
    public static void main(String[] args) {
        Program obj = new Program();
        Scanner sc = new Scanner(System.in);

        // System.out.println("Please enter the number :");
        // int num=sc.nextInt();
        // obj.Armstrong(num);
        // obj.Prime(num);
        // obj.RangePrime(3, 20);
        // int res = obj.GCD(250, 100);
         obj.LCM(12, 20);
    }
}
