package L13andL14andL15;

/**
 * BitManipulation
 */
public class BitManipulation {
    void EvenOrOdd(int num) {
    
        if ((num & 1) != 0)
            System.out.println(num + " is a odd number");
        else
            System.out.println(num + " is even number");
    }
    int SetIthBit(int num,int bit){
        return num|(1<<bit);
    }
    void UnSetBit(int num,int bit){
        int res=num&(~(1<<bit));
        System.out.println(res);
    }
    void toggleBit(int num,int bit){
        int res=num^(1<<bit);
        System.out.println(res);
    }
    public static void main(String[] args) {
      BitManipulation obj=new BitManipulation();
    //   obj.EvenOrOdd(18);
    //   int res=obj.SetIthBit(5, 2);
    //   System.out.println(res);
    // obj.toggleBit(5,2);
    obj.UnSetBit(5,2 );
    }
}