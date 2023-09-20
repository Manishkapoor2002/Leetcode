public class q162 {
    public static int findPeakElement(int[] nums) {

        if(nums.length == 1){
            return  0;
        }
        if(nums.length == 2){
            int max = Math.max(nums[0],nums[1]);
            if(max == nums[0]){
                return  0;
            }else {
                return 1;
            }
        }

        int low = 0;
        int high = nums.length-1;
        int mid = 0;

        while (low<=high){
            mid = (low+high)/2;

            if(low==mid && low==0){
                int max = Math.max(nums[low],nums[low+1]);
                if(max==nums[low]){
                    return low;
                }else{
                    return low+1;
                }
            }

            if(high==mid && high==nums.length-1){
                int max = Math.max(nums[high],nums[high-1]);
                if(max==nums[high]){
                    return high;
                }else {
                    return (high-1);
                }
            }


            if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid-1]){
                high = mid-1;
            }else if(nums[mid]<nums[mid+1]) {
                low = mid+1;

            }

        }


        return 0;
    }
    public static void main(String[] args) {
        int[] nums= {1,2,3,1};
        int ans =findPeakElement(nums);
        System.out.println(ans);
    }
}