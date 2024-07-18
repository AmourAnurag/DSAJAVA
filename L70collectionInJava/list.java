package L70collectionInJava;

import java.util.*;

//in List interface there are four classes which is as follows ArrayList ,LinkedList and Stack 
public class list {
    public static void main(String[] args) {

        // creating arrayList adding number and manipulate them
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(55);

        // adding at a particular index
        list.add(1, 56);

        // list.remove(1);
        System.out.println(list);
        System.out.println(list.isEmpty());

        // check if element exist in list or not
        System.out.println(list.contains(52));

        // printing element using iterator
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // sorting element of list using comparator
        list.sort(new Comparator<Integer>() {
            public int compare(Integer A, Integer B) {
                return A - B; // A-B = assending and B-A => decending
            }
        });
        System.out.println(list);

        // manipulating with Student class
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(5, "Ram"));
        list1.add(new Student(10, "Kam"));
        list1.add(new Student(58, "Ram"));
        list1.add(new Student(15, "As"));
        System.out.println(list1);

        //comparing student on the basic of name and roll number
        list1.sort(new Comparator<Student>() {
            public int compare(Student A,Student B){
                int res=A.name.compareTo(B.name);
                //if the name of the students are same
                if (res==0) {
                    return A.rollnumber-B.rollnumber;
                }
                return res;
            }
        });
        System.out.println(list1);


        //stack data structure
        //creating a new stack
        Stack<Integer> stack=new Stack<>();

        //operation on the stack
        stack.push(15); //pushing the element ti the stack
        stack.push(75);
        stack.push(25);
        stack.push(45);
        stack.push(55);
        stack.push(95);
        stack.push(85);
        System.out.println(stack);
        System.out.println(stack.peek()); //it shows the top of the stack

        //removing the element from the stack
        stack.pop();
        System.out.println(stack);

        //to checking the size of the stack
        System.out.println(stack.pop() + " " +stack.size());

    }

    static class Student {
        int rollnumber;
        String name;

        public Student(int rollnumber, String name) {
            this.rollnumber = rollnumber;
            this.name = name;
        }

        public String toString() {
            return "{" + rollnumber + "," + name + "}";
        }
    }

}
