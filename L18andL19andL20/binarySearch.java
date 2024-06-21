package DSAJAVA.L18andL19andL20;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 15, 20, 25, 30, 45, 65, 78 };
        int arr1[]={78,65,45,30,25,20,15};
        //for assecding order
        BinarySearchAesc(arr, 65);

        //for desending order
        BinarySearchdesc(arr1, 65);
    }

    static void BinarySearchAesc(int arr[],int target){
        int start=0,end=arr.length-1,mid;
        while (start<=end) {
            mid=start+(end-start)/2;
            if (arr[mid]>target) {
                end=mid-1;
            }else if (arr[mid]<target) {
                start=mid+1;
            }else{
                System.out.println("Element is found at index "+mid);
                return;
            }
        }
       System.out.println("Element is not found");
    }
    static void BinarySearchdesc(int arr[],int target){
        int start=0,end=arr.length-1,mid;
        while (start<=end) {
            mid=start+(end-start)/2;
            if (arr[mid]<target) {
                end=mid-1;
            }else if (arr[mid]>target) {
                start=mid+1;
            }else{
                System.out.println("Element is found at index "+mid);
                return;
            }
        }
       System.out.println("Element is not found");
    }
}
