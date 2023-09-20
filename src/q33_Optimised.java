public class q33_Optimised {

    public static int search(int[] nums, int target) {


        if(nums.length==1){
            if(nums[0] == target){
                return 0;
            }else{
                return -1;
            }
        }

        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        System.out.println(low +" , " +high);

        while (low <= high) {
            mid  = (low+high)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<nums[mid]){
                if(target>=nums[low] && target<nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;;
                }
            }else {
                    if(target<=nums[high] && target>nums[mid]){
                        low = mid+1;
                    }else{
                        high = mid-1;
                    }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }
}