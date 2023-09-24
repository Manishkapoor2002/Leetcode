import java.util.Arrays;

public class q1283 {

    public static int Calculatethreshold(int[] nums,int mid){
        int ceilSum = 0;
        int[] dumb = new int[nums.length];
        for(int i = 0;i< nums.length;i++){
            ceilSum += (int)Math.ceil((double)nums[i] / mid);
            dumb[i] = (int)Math.ceil((double)nums[i] / mid);
        }
        return ceilSum;
    }
    public static int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int mid = 0;
        int ans = 0;
//        System.out.println(low + " , " +high);

        while (low<=high){
            mid = (low+high)/2;
            int currentthreshold = Calculatethreshold(nums,mid);
            if(currentthreshold<=threshold){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {44,22,33,11,1};
        int threshold = 5;
        int ans = smallestDivisor(nums,threshold);
        System.out.println(ans);
    }
}