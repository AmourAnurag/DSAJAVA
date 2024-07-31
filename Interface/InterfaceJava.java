package Interface;

interface Bike{
    void print();
}
class Honda implements Bike{
   @Override
   public void print() {
       System.out.println("Bike is running at the port 8001");
   }
   void printHello(){
    System.out.println("this is the method of the honda class");
   }
}
interface Hero extends Bike{
  @Override
  default void print() {
      System.out.println("Hero bike is the best bike in india");
  }

}
public class InterfaceJava implements Hero {
     public static void main(String arg[]){
        Honda hd=new Honda();
        hd.print();
        InterfaceJava sc=new InterfaceJava();
        sc.print();
     }
}
