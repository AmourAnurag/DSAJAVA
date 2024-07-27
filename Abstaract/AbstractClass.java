package Abstaract;

abstract class Bike{
     void run(){
        System.out.println("Bike is running at the speed of 100+");
    }
    abstract int price(int n);
}
public class AbstractClass extends Bike {
    int price(int n){
          return n;
    }
    public static void main(String []args){
        Bike bk=new AbstractClass() ;
        System.out.println(bk.price(45000));
        bk.run();
    }
}
