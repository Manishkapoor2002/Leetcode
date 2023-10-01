public class q80 {

    public static int removeDuplicates(int[] nums) {
        int idx = 1,count = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;

    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int ans = removeDuplicates(nums);
//        System.out.println(ans);

    }
}