package L76OOOPS;

class Car {
    String brand;
    String color;
    int speed;
    String model;
    boolean ABS;

    Car(int speed, String brand, String color, boolean ABS, String model) {
        this.speed = speed;
        this.brand = brand;
        this.color = color;
        this.ABS = ABS;
        this.model = model;

    }

    Car(Car newCar) {
        this.speed = newCar.speed;
        this.brand = newCar.brand;
        this.color = newCar.color;
        this.ABS = newCar.ABS;
        this.model = newCar.model;
    }

    // function of the class
    public void driving() {
        System.out.println("CAr is driving by the a person");
    }

    public void speed(int speed) {
        this.speed = speed;
        System.out.println("Currently speed of the car is " + speed);
    }

}

public class Basic {
    public static void main(String[] args) {
        Car car = new Car(85, "Maruti", "RED", true, "2008");
        System.out.println(car.speed);
        
        // copy constructor
        Car car1 = new Car(car);
        System.out.println(car1.speed);
        //if we change the speed of first car then it will not affect second car speed 
        car.speed=98;
        System.out.println(car.speed);
        System.out.println(car1.speed);

        //but if we pass the refrence then then it will change the speed of both car
        Car car2=car; //this will effect both cars functionality
        System.out.println(car2.speed);
        System.out.println(car.speed);

        car.speed=5689;
        System.out.println(car2.speed);
        System.out.println(car.speed);
        
    }
}
