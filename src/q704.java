public class q704 {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target<nums[mid]){
                right = mid-1;
            }else if(target>nums[mid]){
                left = mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 2;
        int ans = search(nums,target);
        System.out.println(ans);

    }
}