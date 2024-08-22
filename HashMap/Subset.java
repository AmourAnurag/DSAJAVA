import java.util.HashMap;

public class Subset {

    public static boolean isSubset(int arr1[],int arr2[]){
       
        HashMap<Integer ,Integer>freqmap=new HashMap<>();
        for(int element:arr1){
            freqmap.put(element, freqmap.getOrDefault(element, 0)+1);
        }
        for(int element:arr2){
            if (freqmap.containsKey(element) && (freqmap.get(element)>0)) {
                freqmap.put(element, freqmap.get(element)-1);
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[]={1,2,2,1,6,4,3};
        int arr1[]={1,2,4,1};

        boolean ans=isSubset(arr,arr1);
        System.out.println(ans);
    }
}
