package nestedClass.innerClasses;

//local inner class access both type of variable static and non static varaible
class outerClass{
    static int x=10;
    private int y=20;
    void display(){
        class innerClass{
            void print(){
                System.out.println("Value of the x "+x);
                System.out.println("Value of the x "+y);
            }
        }
        innerClass obj=new innerClass();
        obj.print();
    }
}
public class InnerClasses {
    public static void main(String args[]){
        outerClass obj=new outerClass();
        obj.display();
    }
}
