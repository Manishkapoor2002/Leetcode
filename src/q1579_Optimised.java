public class q1579_Optimised {
    public static int findKthPositive(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = (low+high)/2;
                int mis = nums[mid] - mid -1;
            if(mis<k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low+k;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));

    }
}
