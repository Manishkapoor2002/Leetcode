import java.util.Arrays;

public class q136 {
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        if(nums.length == 1){
            return nums[0];
        }
//
//        for(int i = 0;i<nums.length;i++){
//            int flag = 0;
//            for(int j = 0;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    flag++;
//                }
//            }
////            System.out.println(flag);
//            if(flag == 1){
//                return nums[i];
//            }
//        }

        Arrays.sort(nums);
        for(int i =1;i<nums.length;i=i+2){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }

        return nums[n-1];
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,3,3,4};
        int ans = singleNumber(nums);
        System.out.println(ans);

    }
}