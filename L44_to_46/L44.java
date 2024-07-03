package L44_to_46;

public class L44 {
    static void PrintArray(int array[]) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static void main(String[] args) {

        int ar[] = { 4, 9, 1, 2, 3, 5, 6 };

        PrintArray(ar);
        // res=obj.countSort(ar);
        System.out.println();
        CyclicActualSort(ar);

    }

    static void cyclicSort0toN(int arr[]) {
        int n = arr.length;
        int index = 0;
        while (index < n) {
            int element = arr[index];
            int actualPos = element;
            if (element < n && element != arr[actualPos]) {
                int tmp = arr[index];
                arr[index] = arr[actualPos];
                arr[actualPos] = tmp;

            } else {
                index++;
            }
        }
        PrintArray(arr);
    }

    static void cyclicSort1toN(int arr[]) {
        int n = arr.length;
        int index = 0;
        while (index < n) {
            int element = arr[index];
            int actualPos = element - 1;
            if (element < n && element != arr[actualPos]) {
                int tmp = arr[index];
                arr[index] = arr[actualPos];
                arr[actualPos] = tmp;

            } else {
                index++;
            }
        }
        PrintArray(arr);
    }

    
    public static void CyclicActualSort(int arr[]){
        int n = arr.length;
        for(int cycles=0;cycles<n-1;cycles++){
            int pos = cycles;
            int item = arr[cycles];

            // find number of smaller elements
            for(int i=cycles+1;i<n;i++){
                if(arr[i]<item){
                    pos++;
                }
            }
            // element is at correct position
            if(pos==cycles){
                continue;
            }
            //ignore duplicates
            while(arr[pos]==item){
                pos++;
            }
            // if smaller elements are found then perform swapping.
            if(pos!=cycles){
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }
            // check if more swaps are required.
            while(pos!=cycles){
                pos = cycles;
                // find number of smaller elements
                for(int i=cycles+1;i<n;i++){
                    if(arr[i]<item){
                        pos++;
                    }
                }
                //ignore duplicates
                while(arr[pos]==item){
                    pos++;
                }
                if(item!=arr[pos]){
                    int temp = arr[pos];
                    arr[pos] = item;
                    item = temp;
                }
            }
        }
        PrintArray(arr);
    }
}
