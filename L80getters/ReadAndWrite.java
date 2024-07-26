package L80getters;

class ReadOnly {
    private int age;
    private String name;

    ReadOnly(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

     void setAge(int age){
        this.age=age;
    }
     void setName(String age){
        this.name=name;
    }
}

public class ReadAndWrite {
    public static void main(String[] args) {
        ReadOnly rd = new ReadOnly(45,"Ram");
        System.out.println(rd.getAge()+" "+rd.getName());

        rd.setAge(89);
        rd.setName("Gaja");
        System.out.println(rd.getAge()+" "+rd.getName());

    }
}
