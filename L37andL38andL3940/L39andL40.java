package L37andL38andL3940;

/**
 * L39andL40
 */
public class L39andL40 {
    static void PrintArray(int array[]){
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]+" ");
        }
    }
    public static void main(String []args){
        L39andL40 obj=new L39andL40();
        int ar[]={4,8,1,2,0,3,6};
        PrintArray(ar);
        obj.BrickSort(ar);
        System.out.println();
        PrintArray(ar);

    }
    void BubbleSort(int arr[]){
        int n=arr.length-2;
        for(int i=0;i<=n;i++){
            boolean flag=false;
            for(int j=0;j<=n-i;j++){
                if (arr[j]>arr[j+1]) {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flag=true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    void BrickSort(int[] arr){
        int n=arr.length-1;
        boolean isSorted=false;
        while (!isSorted) {
            boolean flag=false;
            for(int i=0;i<n;i+=2){
                if (arr[i]>arr[i+1]) {
                    int tmp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                    flag=true;
                }
            }
            for(int i=1;i<n;i+=2){
                if (arr[i]>arr[i+1]) {
                    int tmp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                    flag=true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}