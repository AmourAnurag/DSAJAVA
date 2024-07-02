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
        //  res=obj.countSort(ar);
        
        System.out.println();
        PrintArray(pigeonSort(ar));

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

    int[] countSort(int[] arr){
        int n=arr.length;
        int k=-1;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if (arr[i]>k) {
                k=arr[i];
            }
        }
        if (k==-1) {
           return arr; 
        }
        int countArray[]=new int[k+1];

        //find the frequency of digits
        for(int i=0;i<n;i++){
            int index=arr[i];
            countArray[index]++;
        }

        //find cumulative frequency
        for(int i=1;i<=k;i++){
            countArray[i]=countArray[i]+countArray[i-1];
        }

        //find sorted array
        for(int i =n-1;i>=0;i--){
            int val=arr[i];
            int countVal=--countArray[val];
            res[countVal]=val;
        }
        return res;
    }

    public static void countSortWithDigit(int[] arr,int digit){
        int n=arr.length;
        int k=9;
        int res[]=new int[n];
       
        if (k==-1) {
           return ; 
        }
        int countArray[]=new int[k+1];

        //find the frequency of digits
        for(int i=0;i<n;i++){
            int index=(arr[i]/digit)%10;
            System.out.println("element is "+arr[i]+" digit is "+digit);
            countArray[index]++;
        }

        //find cumulative frequency
        for(int i=1;i<=k;i++){
            countArray[i]=countArray[i]+countArray[i-1];
        }
        PrintArray(countArray);
        //find sorted array
        for(int i =n-1;i>=0;i--){
            int val=arr[i];
            System.out.println("Value is "+val);
            int countIndex=(arr[i]/digit)%10;
            System.out.println("index in count array "+countIndex);
            int countVal=--countArray[val];
            System.out.println("Element "+val+"placed at index "+countVal);
            res[countVal]=val;
        }
        //coppy back to original array
        for(int j=0;j<n;j++){
            arr[j]=res[j];
        }
        PrintArray(arr);
    }
    public static void radixSort(int arr[]){
        int n= arr.length;
        int maxEl=Integer.MIN_VALUE;
        for(int i=0 ;i<n ;i++){
            if (arr[i]>maxEl) {
                maxEl=arr[i];
            }
        }
       if (maxEl==Integer.MIN_VALUE) {
        System.out.println("Empty array");
        return;
       }
       for(int digit=1;maxEl/digit>0;digit*=10){
        countSortWithDigit(arr, digit);
       }
    }

    public static int[] pigeonSort(int[] arr) {
        int n = arr.length;
        int minEL = Integer.MAX_VALUE;
        int maxEL = Integer.MIN_VALUE;
        
        // Find the minimum and maximum elements in the array
        for (int i = 0; i < n; i++) {
            if (minEL > arr[i]) {
                minEL = arr[i];
            }
            if (maxEL < arr[i]) {
                maxEL = arr[i];
            }
        }
        
        // Create a counting array
        int range = maxEL - minEL + 1;
        int[] count = new int[range];
        
        // Populate the counting array
        for (int i = 0; i < n; i++) {
            int index = arr[i] - minEL;
            count[index]++;
        }
        
        // Create the sorted array
        int[] sorted = new int[n];
        int k = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                sorted[k] = minEL + i;
                k++;
                count[i]--;
            }
        }
        
        return sorted;
    }
    
}