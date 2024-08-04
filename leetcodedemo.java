import java.util.Arrays;

public class leetcodedemo {
    static void removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public int rangeSum(int[] nums, int n, int left, int right) {
        int len = (n * (n + 1)) / 2;
        int arr[] = new int[len];
        int k = 0;
        
        for (int i = 0; i < n; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < 4; j++) {
              
                // System.out.print(sum+" ");
                arr[k++]=sum;
                sum = sum + nums[j];
            }
            arr[k++]=sum;
        }
        Arrays.sort(arr);
        int total = 0;
        for (int i = left-1; i <right; i++) {
            total = total + arr[i];
            // System.out.print(arr[i]+" ");
        }
        return total;
    }

    public static void main(String[] args) {
        leetcodedemo obj = new leetcodedemo();
        int nums[] = { 1, 2, 3, 4 };
        int h=obj.rangeSum(nums, 4, 1, 5);
System.out.println(h);
    }
}
