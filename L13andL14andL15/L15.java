package L13andL14andL15;

public class L15 {
    void clearLSB(int num, int bit) {
        System.out.println(num); // ex-> num=15 = 1111
        // System.out.println(1<<bit+1);
        int res = num & (~((1 << bit + 1) - 1)); // res=1000
        System.out.println(res);
    }

    void clearMSB(int num, int bit) {
        System.out.println(num); // ex->num=15=1111
        int res = num & (((1 << bit + 1) - 1)); // res=0111
        System.out.println(res);
    }

    void ConvertUpperToLower(int num) {

        // another way
        // char ch=(char)(32+num);
        // System.out.println(ch);

        // using bit manipulation //using same mechanism we convert lower to uppercase
        char ch = (char) (num | (1 << 5));
        System.out.println(ch);
    }

    void swap(int num1,int num2){
        System.out.println("num1 "+num1+" num2 "+num2);
         num1=num1^num2;
         num2=num1^num2;
         num1=num1^num2;
         System.out.println("num1 "+num1+" num2 "+num2);

    }
    int UniqueNumber(int arr[]){
        int l=arr.length,res=0;
        for (int i = 0; i < l; i++) {
            res=res^arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        L15 obj = new L15();
        // obj.clearLSB(15,2 );
        // obj.clearMSB(15, 2);
        // obj.ConvertUpperToLower('A');
        obj.swap(12, 10);
        int arr[]={1,2,7,6,7,3,2,6,1};
        System.out.println(obj.UniqueNumber(arr));
        System.out.println(2&-1);
    }
}
