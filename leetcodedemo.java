public class leetcodedemo {
    static void removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
          for(int i=0;i<j;i++){
            System.out.print(nums[i]+" ");
        }

      
    }
    public static void main(String[] args) {
       int[] nums = {0,1,2,2,3,0,4,2} ;int val = 2;
       removeElement(nums, val);
    }
}
