package L16andL17;

public class L17 {
    public static void main(String[] args) {
        L17 obj=new L17();

        int arr[]={2,4,5,8,7,6,3,9,78,1};
        // obj.findElement(arr,19);
        // obj.findMax(arr);
        // obj.findMin(arr);

        int arr1[][]={{1,2,5,4,8},{4,8,9,7,16},{6,7,9,51,2},{9,8,7,5,6}};
        // obj.findElement2d(arr1,82);
        // obj.findMaxSubArray(arr1);
       
    }
    void findElement(int arr[],int target){
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                index=i;
                break;
            }
        }
        if (index>-1) {
            System.out.println("Element is found at index : "+index);          
        } else {
            System.out.println("Element is not found in this array");
        }
    }
    void findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Maximum element in this array : "+max);
    }
    void findMin(int arr[]){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("Maximum element in this array : "+min);
    }
    void findElement2d(int arr[][],int target){
        int rowIndex=-1,colIndex=-1;
        for (int index = 0; index < arr.length; index++) {
           int size=arr[index].length;
           for (int j = 0; j < size; j++) {
            if (target==arr[index][j]) {
                rowIndex=index;
                colIndex=j;
              
            }
           }
        }
        if (rowIndex>-1) {
            System.out.println("Element is found at rowindex "+rowIndex+" and colindex "+colIndex);          
        } else {
            System.out.println("hyy buddy element is not found in this array");
        }
    }
    void findMaxSubArray(int arr[][]){
        int result=Integer.MIN_VALUE,rowIndex=-1;
        for (int index = 0; index < arr.length; index++) {
            int sum=0;
            int size=arr[index].length;
            for (int j = 0; j < size; j++) {
             sum+=arr[index][j];
           
            }
            if (sum>result) {
                result=sum;
                rowIndex=index;
            }
         }
         System.out.println(result+" at index "+rowIndex);
    }
}
