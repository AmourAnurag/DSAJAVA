package DSAJAVA.L18andL19andL20;

public class L19_Problems {
    public static void main(String[] args) {
        int arr[]={2,2,3,3,3,4,4,4,4,4,8,12,16};
        int arr1[]={4,5,6,8,9,15,16};
    //    int res= BinarySearchAesc(arr, 4);
    //    System.out.println("Element is found at "+res);

    int floorNum=Floor(arr1, 7);
    System.out.println(floorNum);
    }
    static int BinarySearchAesc(int arr[],int target){
        int start=0,end=arr.length-1,mid,index=0;
        while (start<=end) {
            mid=start+(end-start)/2;
            if (arr[mid]>target) {
                end=mid-1;
            }else if (arr[mid]<target) {
                start=mid+1;
            }else if(arr[mid]==target){
                // while (arr[mid]==target) {
                //     index=mid;
                //     mid++;
                // }
                index=mid;
                //end=mid-1;//for first occurence
                start=mid+1;//for last occurence
                
             }
        }

        return index;
    }
    static int Floor(int arr[],int target){
        int start=0,end=arr.length-1,mid,index=-1;
        while (start<=end) {
            mid=start+(end-start)/2;
            if (arr[mid]>target) {
                end=mid-1;
                index=arr[mid];  //for ceil
            }else if (arr[mid]<target) {
                start=mid+1;
                // index=arr[mid];//for floor
            }else if(arr[mid]==target){
               
                index=arr[mid];
                return index;
             }
        }

        return index;
    }
}
