public class q283 {
    public static void print(int[] nums){
        for(int num:nums){
            System.out.print(num);
        }
    }
    public static void moveZeroes(int[] nums) {
        int count = 1;
        while(count<nums.length){
            for(int i = 0;i<(nums.length-count);i++){
                if(nums[i]==0){
                    int temp = 0;
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            count++;
        }

    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        print(nums);
    }
}