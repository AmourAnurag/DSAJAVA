package L49toL51;

public class L49 {
    public static void main(String args[]){
        String name1="Anurag";
        String name2=new String("Anurag");

        String name3="Aman";

        // System.out.println(name1==name2); //it compares 
        // System.out.println(name1.equals(name2));


        //some string method
        String str="Anurag Singh";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(5));
        System.out.println(str.lastIndexOf("g"));
        System.out.println(str.indexOf("g"));
        System.out.println(str.trim());
        System.out.println(str.startsWith("A"));
        System.out.println(str.endsWith("k"));

        //convert String to string array
        String str2="Ram Shyam Golu Molu";
        String StringArr[]=str2.split(" ");
        for (int index = 0; index < StringArr.length; index++) {
            System.out.print(StringArr[index]+" ");
        }

        //concept of String builder  String builder is more safe than  a string it is more  faster than string an it modify the string without creating a new string unlike a string if we try to modify the string than it creates a new object but in case of string builder when we try to modify the exsiting string then it try to modify it now you can see the example of string buider in below

        
        // Create a StringBuilder object
        // using StringBuilder() constructor
        StringBuilder st = new StringBuilder();
 
        st.append("GFG");
 
        // print string
        System.out.println("\nString = " + st);
 
        // create a StringBuilder object
        // using StringBuilder(CharSequence) constructor
        StringBuilder str1
            = new StringBuilder("AAAABBBCCCC");
 
        // print string
        System.out.println("String1 = " + str1);
 
        // create a StringBuilder object
        // using StringBuilder(capacity) constructor
        StringBuilder str3 = new StringBuilder(10);
 
        // print string
        str3.append("tamnghhhhjj");
        System.out.println("String2 capacity = "
                           + str3.capacity()+" "+str3);
 
        // create a StringBuilder object
        // using StringBuilder(String) constructor
        StringBuilder str4
            = new StringBuilder(str1.toString());
 
        // print string
        System.out.println("String3 = " + str4.toString());


    }
}
