public class q81 {

    public static boolean search(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] == target){
                return true;
            }else{
                return false;
            }
        }

        int low = 0;
        int high = nums.length-1;
        int mid = 0;

        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid] == target){
                return true;
            }

            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                high--;
                low++;
                continue;
            }

            if(nums[low]<=nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else{
                if(target<=nums[high] && target>nums[mid]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target  = 2;
        boolean ans = search(nums,target);
        System.out.println(ans);
    }
}