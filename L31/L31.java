package L31;

import java.util.*;

public class L31 {
    public static void main(String []args){
        int arr[]={4,5,8,9,12,45,89,96,124,156};
        Scanner sc=new Scanner(System.in);
        int target;
        System.out.println("Enter your target : ");
         target= sc.nextInt();
        
         //searching via jump sort
        //  jumpSort(arr,target);

         //searching element via ternary sort
        //  int index=TernarySort(arr,target);

         //Searching via Exponential Search
         int index=ExponentialSearch(arr,target);
         if (index!=-1) {
            System.out.println("Element is found at index : "+index);
         }else System.out.println("Element is not found");
         sc.close();
    }

    //Example of jump search algorithm
    static void jumpSort(int[] arr,int target){
        int blockSize=(int)(Math.sqrt(arr.length));
        int start=0,end=blockSize;
        while (end<arr.length && arr[end]<=target) {
            start=end;
            end=end+blockSize;
            if(end>arr.length)
             end=arr.length;
        }
        for (int index = start; index < end; index++) {
            if (arr[index]==target) {
                index++;
                System.out.println("Element is found at index "+index);
                return;
            }
        }
        System.out.println("Element is not present in array");
    }


    //Example of ternaary sort
    static int TernarySort(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid1=start+(end-start)/3;
            int mid2=end-(end-start)/3;
            if (target<=arr[mid1]) {
                if(target==arr[mid1]) return mid1;
                end=mid1-1;

            }else if (target>=arr[mid2]) {
                if(target==arr[mid2]) return mid2;
                start=mid2+1;

            }else{
                start=mid1+1;
                end=mid2-1;
            }
        }
        return -1;
    }


    //Example of exponential Search
    static int ExponentialSearch(int[] arr, int target){
        int start=1,end;
        if (arr[0]==target) {
            return 0;
        }
        int i=1;
        
        while (i < arr.length && arr[i] < target) {
            start=i;
            i=i*2;
        }
        end=Math.min(i, arr.length-1);
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target==arr[mid]) {
                return mid;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
