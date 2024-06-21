package L21andL22andL23;

public class L22 {
    public static void main(String args[]){
        int arr[] = {4,5,7,11,85,1,2};

        //FIND MIN ELEMENT IN ROTETED SORTED ARRAY
        // int index = minElement(arr);
        // System.out.println(arr[index]);

        //FIND MAX ELEMENT IN ARRAY ROTATED SORTED ARRAY
        int index1 = maxElement(arr);
        System.out.println(arr[index1]);

        //SEARCH ELEMENT IN ROTATED ARRAY
        // int index2 = searchInRotatedArray(arr,66);
        // if(index2 == -1){
        //     System.out.println("Element does not exist");
        // } else
        // System.out.println(arr[index2]);

        //COUNT THE ROTATION IN ARRRAY
        // rotationCountInCWSA(arr);
        // rotationCountInACWSA(arr);

    }
    
    static void rotationCountInACWSA(int arr[]){
        int index = minElement(arr);
        System.out.println("ACW Rotation count is:"+ ((arr.length-index)%arr.length));
    }
    static void rotationCountInCWSA(int arr[]){
        int index = minElement(arr);
        System.out.println("CW Rotation count is:"+ index);
    }
    // static int searchInRotatedArray(int arr[], int target){
    // }
    static int maxElement(int arr[]){
        int start=0,end=arr.length-1;                      
        while (start<end) {
            int mid=start+(end-start)/2;                  
            if (mid>0 && arr[mid]>arr[mid+1]) {           
                return mid;
            }else if(arr[mid]>arr[end]){                   
                start=mid+1;                            
            }
            else{
                end=mid-1;                          
            }
        }
        return start;
        }
    
    static int minElement(int arr[]){
        int start=0,end=arr.length-1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if (mid>0 && arr[mid]<arr[mid-1]) {
                return mid;
            }else if(arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
    // static int minElementDuplicates(int arr[]){
    // }
}
