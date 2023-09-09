public class q53 {
    public static void main(String[] args) {
        int[] nums = {-1,3,2,-4,-2,-6,3,5,-7};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        if(nums.length == 1){
            System.out.println(nums[0]);
        }

        for(int i = 0;i< nums.length;i++){
           sum = sum + nums[i];
            max = Math.max(max,sum);

            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}