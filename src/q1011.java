import java.util.*;

public class q1011 {

    public static int CalDaysTaken(int[] nums,int cap){
        int[] arr = new int[nums.length];
        int days = 1;
        int load = 0;
        for(int i =0;i< nums.length;i++){
            load += nums[i];
            if(load>cap){
                days++;
                load = nums[i];
            }
            arr[i] = load;
        }
        for (int k : arr){
            System.out.print(k +" , ");
        }
        System.out.println();
        System.out.println(days + " , " +cap);

        return days;

    }
    public static int shipWithinDays(int[] weights, int days) {
     int low =0;
     for(int i = 1;i< weights.length;i++){
         if(weights[i]> weights[i-1]){
             low = weights[i];
         }
        }

     int high  = Arrays.stream(weights).sum();

     for (int i = low;i<high;i++){
         int daysReq = CalDaysTaken(weights,i);
         if(daysReq==days){
             return i;
         }
     }


        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int ans = shipWithinDays(nums,days);
        System.out.println(ans);

    }
}