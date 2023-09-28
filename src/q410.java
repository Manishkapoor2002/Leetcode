import java.util.Arrays;

public class q410 {


    public static int calMaxStudetns(int[] nums,int pages){
        int students = 1;
        int pageHold = 0;
        for(int i = 0;i<nums.length;i++){
            if(pageHold + nums[i]<=pages){
                pageHold += nums[i];
            }else{
                students++;
                pageHold = nums[i];
            }
        }

        return students;
    }
    public static int splitArray(int[] nums, int k) {
        int n = nums.length;

        if(n == 1){
            return nums[0];
        }
        if(n<k){
            return -1;
        }

        int low = 0;
        int high = 0;

        for(int i = 0;i<n;i++){
            low = Math.max(low,nums[i]);
            high += nums[i];
        }

        if(k==1){
            return high;
        }

        while(low<=high){
            int mid = (low+high)/2;
            int MaxStudents = calMaxStudetns(nums,mid);
            if(MaxStudents <= k){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        int ans = splitArray(nums,k);
        System.out.println(ans);

    }
}