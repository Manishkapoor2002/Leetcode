import java.util.Arrays;

public class q16 {
    public static int threeSumClosest(int[] nums, int target) {

        if(nums.length==2){
            return (nums[0]+nums[1]+nums[2]);
        }

        int idx = 1;
        int closest = Integer.MAX_VALUE;
        int ans = 0;
//
//
//        while(idx<nums.length-1){
//            for(int i = 0;i<idx;i++){
//                int sum = 0;
//                for(int j = idx+1;j<nums.length;j++){
//                    sum = (nums[i] + nums[idx] + nums[j]);
////                    System.out.println(sum);
//                    int currentDiff = 0;
//                    if(sum==target){
//                        return sum;
//                    }else if(sum>target){
//                        currentDiff = sum - target;
//                    }else{
//                        currentDiff = target- sum;
//                    }
//                    if(currentDiff<closest){
//                        ans = sum;
//                        closest = currentDiff;
//                    }
//                }
//            }
//            idx++;
//
//        }
//

//        Optimesd using sort
        Arrays.sort(nums,0,nums.length);
        int sum = 0;

        for (int i = 0;i<nums.length;i++){
            int low = i+1;
            int high = nums.length-1;

            while (low<high){
                sum = nums[low]+nums[i]+nums[high];
                if(sum==target){
                    return sum;
                }else if(sum>target){
                    high--;
                }else{
                    low++;
                }
                 int currentDiff = 0;
               if(sum>target){
                    currentDiff = sum - target;
                }else{
                    currentDiff = target- sum;
                }
                if(currentDiff<closest){
                    ans = sum;
                    closest = currentDiff;
                }

//                if(Math.abs(sum-target)<Math.abs(closest-target)){
//                    closest = sum;
//                }
            }

        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {2,3,8,9,10};
        int tar = 16;
        int ans = threeSumClosest(nums,tar);
        System.out.println(ans);

    }
}