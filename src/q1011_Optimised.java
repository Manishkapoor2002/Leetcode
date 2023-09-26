import java.util.*;

public class q1011_Optimised {

    public static int CalDaysTaken(int[] nums,int cap){
        int[] arr = new int[nums.length];
        int days = 1;
        int load = 0;
        for(int i =0;i< nums.length;i++){
            if((load + nums[i])>cap){
                days++;
                load = nums[i];
            }else{
                load += nums[i];
            }
        }
        return days;

    }
    public static int shipWithinDays(int[] weights, int days) {
        int low =Integer.MIN_VALUE;
        int high  = 0;

        for(int i = 0;i< weights.length;i++){
            low = Math.max(low,weights[i]);
            high += weights[i];
        }


        while (low<=high){
            int mid = (low+high)/2;
            int daysReq = CalDaysTaken(weights,mid);
            if(daysReq<=days){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }


        return low;
    }
    public static void main(String[] args) {
        int[] nums = {170,259,379,369,287,145,259,29,150,410,493,121,184,92,79,168,269,209,139,437};
        int days = 20;
        int ans = shipWithinDays(nums,days);
        System.out.println(ans);

    }
}