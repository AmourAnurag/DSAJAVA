

public class Polymorphism {

    //polymorphism basically is a concept where we define same name function with different argument and when call the function with suitable parameter then different diffferent function is called acccording to the parameter

    static int Area(int radiuos){
        return (int)(3.14*radiuos*radiuos);
    }

    static int Area(int length,int width){
        return (length*width);
    }

    static int Area(int base,int height,String name){
       System.out.print("area of the triangle is ");
       return (int)(0.5*base*height);
    }
    public static void main(String []args){
       
        System.out.println("Area of the circle "+Area(5));
        System.out.println("Area of the rectangle  "+Area(5,8));
        System.out.println(Area(5,8,"Triangle"));
    }
}
