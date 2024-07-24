package Inheritance;

class Car{
    String model;
    String color;
    void driving(){
        System.out.println("You are driving the car ");
    }

}
class Car1 extends Car{  //single level of inheritance
    String company;
    public void speed(){
        System.out.println("Speed of the car is 120km ");
    }
}

class Car3 extends Car{ // example of hierarchical inheritance and single inheritance because Car is extends by two subclasses
    int numGear=9;
    int passengerSeat;
    void AC(){
        System.out.println("AC of the car is already on ");
    }
}
public class Inheritance extends Car1{  //multilevel inheritance

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

     //creating the object of third CAR
     Car3 obj3=new Car3();
     obj3.color="Blue";
    System.out.println("Color of the car is "+obj3.color);
    obj.driving();

    }
}
