package Inheritance;

class Car{
    String model;
    String color;
    void driving(){
        System.out.println("You are driving the car ");
    }

}
class Car1 extends Car{
    String company;
    public void speed(){
        System.out.println("Speed of the car is 120km ");
    }
}
public class Inheritance extends Car1{

    public static void main(String args[]){

     //creating the object of main class
      Inheritance obj=new Inheritance();
      obj.driving(); //example of single inheritance 

    //creating the object of Car class
      Car obj1=new Car();
      obj1.color="RED";
      

    //creating the object of Car1 class
     Car1 obj2=new Car1();

     obj.speed();
     obj.driving();

    }
}
