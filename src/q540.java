public class q540 {
    public static int singleNonDuplicate(int[] nums) {
        for(int i = 0;i< nums.length;i++){
            if(i == 0){
                if(nums[i] == nums[i+1]){
                    continue;
                }else{
                    return nums[i];
                }
            }else if(i == nums.length-1){
                if(nums[i-1] == nums[i]){
                    continue;
                }else {
                    return nums[i];
                }

            }else {
                if(nums[i] == nums[i-1] || nums[i] == nums[i+1]){
                    continue;
                }else {
                    return nums[i];
                }
            }
        }

        return 0;

    }
    public static void main(String[] args) {
    int[] num = {1,1,2,3,3,4,4,8,8};
    int ans = singleNonDuplicate(num);
        System.out.println(ans);
    }
}