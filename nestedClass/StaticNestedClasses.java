package nestedClass;

class outerClass{
    static int outer_x=10;
    int outer_y=20;
    private static int outer_private=30;

    static class StaticNestedDemo{
        void display(){
            System.out.println("Outer x ="+outer_x);
            System.out.println("Outer private ="+outer_private);

            outerClass obj=new outerClass();
            System.out.println("Outer y="+obj.outer_y); //non static variables are not accessed directly it can access only by creating object of the class

        }
    }
}
public class StaticNestedClasses {
    public static void main(String[] args) {
        outerClass.StaticNestedDemo innerObj=new outerClass.StaticNestedDemo();
        innerObj.display();
    }
}
