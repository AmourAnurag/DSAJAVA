package L18andL19andL20;

public class L20 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 9, 16, 24, 35, 54, 65 };

        // minimumAbsolutedifference(arr, -23);

        // find element in an infinite array
        findElementInInfiniteArray(arr, 35);

        //find one in binary sorted array
        int arr1[]={0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1};
        int range[]=findRange(arr1, 1);
        int res=findOneinBinary(arr1, 1, range[0], range[1]);
        System.out.println("First one is in binary sorted array at index "+res);

    }

    //find one in binary sorted array
    static int findOneinBinary(int arr[],int target,int start,int end){
        int mid,index=-1;
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
                end=mid-1;//for first occurence
                // start=mid+1;//for last occurence
                
             }
        }

        return index;
    }
    // find the minimum absolute difference
    static void minimumAbsolutedifference(int arr[], int target) {
        int start = 0, end = arr.length - 1, mid;
        int ans = -1;
        while (start <= end) {

            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = 0;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (ans == -1) {
            if (start == arr.length) {
                ans = Math.abs(target - arr[end]);
            } else if (end == -1) {
                ans = Math.abs(target - arr[start]);
            } else {
                int ans1 = Math.abs(target - arr[end]);
                int ans2 = Math.abs(target - arr[start]);
                ans = ans1 < ans2 ? ans1 : ans2;
            }
        }
        System.out.println("Minimum absolute difference is " + ans);
    }

    // find element in an infinite array -----> function defenition
    static void findElementInInfiniteArray(int arr1[], int target) {
        // find range of element in sorted arrray
        int range[] = findRange(arr1, target);
        int start=range[0];
        int end=range[1];
        System.out.println(range[0] + "," + range[1]);
    //after getting range find element
       findElement(arr1,target,start,end);
    }

    // find range and element in an infinite array
    static int[] findRange(int arr[], int target) {
        int start = 0;
        int end = 1;
        int range[] = new int[2];
        while (arr[end] < target) {
            start = end;
            end = end * 2;
        }
        range[0] = start;
        range[1] = end;
        return range;
    }
    static void findElement(int arr[],int target,int start,int end){
        int ans = -1,mid;
        while (start <= end) {

            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (ans!=-1) {
            System.out.println("element is found at index "+ans);
        }else{
            System.out.print("element is not found");
        }
    }
}
