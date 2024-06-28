package L37andL38andL3940;
public class L3738 {

    public static void main(String[] args){
        int arr[]={4,1,2,3,0,5,9,7,8};
        PrintArray(arr);
        selectionSort(arr);
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
    static void selectionSort(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
           int minIndex=i;
           for(int j=i+1;j<n;j++){
            if (arr[j]<arr[minIndex]) {
                minIndex=j;
            }
           } 
           int tmp=arr[minIndex];
           arr[minIndex]=arr[i];
           arr[i]=tmp;
        }
    }
}