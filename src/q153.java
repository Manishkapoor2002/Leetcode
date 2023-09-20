public class q153 {
    public static int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int min = Integer.MAX_VALUE;



        while(low<=high){
            mid = (low+high)/2;
            min = Math.min(min,nums[mid]);

            if(nums[low]<=nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid+1;
            }else{
                high = mid-1;
            }


        }

        return min;
    }
    public static void main(String[] args) {
        int[] nums = {2,1};
        int ans = findMin(nums);
        System.out.println(ans);

    }
}