import java.util.Scanner;

/**
 * DecimalToBinary
 */
public class DecimalToBinary {

    static int decimaltoBinary(int num){
        int result=0,rem=0,powe=0;
        while (num>0) {
            rem=num%2;
            num/=2;
            result=(int) (result+rem*Math.pow(10, powe));
            powe++;
        }
        return result;
    }
    
    static int decimaltoAnyBase(int num,int base){

        int result=0,rem=0,powe=0;
        while (num>0) {
            rem=num%base;
            num/=base;
            result=(int) (result+rem*Math.pow(10, powe));
            powe++;
        }
        return result;
    }

    static int binarytodecimal(int num){
        int pow=0,res=0;
        while (num>0) {
            int rem=num%10;
            num/=10;
            // System.out.println(num);
            res=(int)(res+rem*Math.pow(2, pow));
            pow++;
        }
        return res;
    }

    static int AnyBasetodecimal(int num,int base){
        int pow=0,res=0;
        while (num>0) {
            int rem=num%10;
            num/=10;
            // System.out.println(num);
            res=(int)(res+rem*Math.pow(base, pow));
            pow++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Decimal number :");
        int num=sc.nextInt();
        System.out.print("Enter the base :");
        int base=sc.nextInt();
        // int t=decimaltoBinary(num);
        // int t=decimaltoAnyBase(num, base);
        // int t=binarytodecimal(num);
        int t=AnyBasetodecimal(num,base);
        System.out.println(t);
        Calculatepower(2, 7);
        sc.close();
    }
    static void Calculatepower(int num,int power){
        double res=1;
        while (power>0) {
            if (power%2!=0) {
                res=res*num;
            }
            power/=2;
            num=num*num;
        }
        System.out.println(res);
    }
    
}