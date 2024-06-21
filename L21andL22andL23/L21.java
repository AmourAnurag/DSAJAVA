package L21andL22andL23;

public class L21 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,12,8,5,3,1};  //example of a bitonic array
        int index;

        //find minimum element in this array
        // index=minimumInBitonic(arr);
        // System.out.println("Minimum element at index "+index);

        //find maximum element in the bitonic array
        index=maximumInBitonic(arr);
        System.out.println(index);
    }
    static int minimumInBitonic(int arr[]){
       return arr[0]<arr[arr.length-1]?0:arr.length-1;
    }
    static int maximumInBitonic(int arr[]){
       int start=0,end=arr.length-1,mid,prev,next;
       while (start<=end) {
        mid=start+(end-start)/2;
        prev=(mid-1+arr.length)%arr.length;
        next=(mid+1)%arr.length;
        if (arr[mid]>arr[prev]&&arr[mid]>arr[next]) {
            return mid;
        }
        else if(arr[mid]<arr[next]){
            start=mid;
        }else{
            end=mid;
        }
       }
       return -1;
    }
}
