import java.util.*;

public class map {
    public static void main(String []args){
        //Map is a such type type of datastructure which stores data as a key value pair so it is very fast is do every operation in O(1) except containsValue method because it check the data linear

        //creating the map
        Map<Integer,String>classMap=new HashMap<>();
        classMap.put(1, "Ram");
        classMap.put(2, "Shyam");
        classMap.put(5, "Seeta");
        classMap.put(4, "Laksham");
        classMap.put(8, "Dashrath");
        classMap.put(3, "Hanuman");
        classMap.put(7, "Raja");
        System.out.println(classMap);

        System.out.println(classMap.get(5)); //getting data by key 
        System.out.println(classMap.getOrDefault(9,"RAMA")); //it is also used for getting data but it returns budefault a  value if the corresponding key is not represent

        //for checking a particular data is present in map or not
        System.out.println(classMap.containsKey(78));
        System.out.println(classMap.containsValue("78"));

        //traversing the map data by using for loop
        for(Map.Entry<Integer,String>entry:classMap.entrySet()){
            System.out.println("Key "+entry.getKey()+" Value "+entry.getValue());
        }

        //printing only keys
        for(Integer key:classMap.keySet()){
            System.out.print(key+" ");
        }

        //printing only values
        for(String value:classMap.values()){
            System.out.print(value+" ");
        }

    }
}
