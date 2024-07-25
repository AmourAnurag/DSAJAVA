package importantKeyword;

 class Old {
     void display() {  //if we declare it final then it cannot be overridden
        System.out.println("This is the class of the old man ");
    }
}

class Young extends Old{
    int age = 45;

    Young() {
        System.out.println("This is the class of the young man age is above " + age);
    }
    @Override
    void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("Ram RAm");
    }
}

class Child extends Young {
    Child() {
        super();
    }

    int age = 5;

    void ageOfChild(int age) {
        this.age = age;
    }

}

public class Keyword {
    public static void main(String[] args) {
        Child sc = new Child();
        sc.ageOfChild(15);
        System.out.println(sc.age);
        sc.display();
    }
}
