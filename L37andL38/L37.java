/**
 * L37
 */
public class L37 {

    public static void main(String[] args){
        int arr[]={4,1,2,3,0,5,9,7,8};
        PrintArray(arr);
        insertionSort(arr);
        System.out.println();
        PrintArray(arr);
        
    }
    static void PrintArray(int array[]){
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]+" ");
        }
    }
    static void insertionSort(int arr[]){
        int key,j;
        for(int i=1;i<arr.length;i++){
             key=arr[i];
             j=i-1;
             while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
             }
             arr[j+1]=key;
        }
    }
}