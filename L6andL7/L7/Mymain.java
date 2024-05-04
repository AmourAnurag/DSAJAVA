package L6andL7.L7;

import L6andL7.L7.Student.Studentdetails;
import L6andL7.L7.Teacher.Teacherdetails;
public class Mymain {
    public static void main(String[] args) {
        System.out.println("I am a main class");
        Studentdetails sd=new Studentdetails();
        sd.print();
        
        Teacherdetails td=new Teacherdetails();
        td.print();
    }
}
