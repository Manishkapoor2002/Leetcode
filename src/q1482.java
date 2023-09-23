//import java.util.Arrays;
import java.util.*;
public class q1482 {

    public static boolean checkBouquetValid(int[] nums,int bouquets,int flowers,int days){
//        int[] dum = new int[nums.length];

        int count = 0;
        for (int i = 0;i<nums.length;i++){
            if(nums[i] <= days){
                count ++;
            }else {
                count = 0;
            }
//            dum[i] = count;

            if(count == flowers){
                bouquets--;
                count = 0;
            }
        }

        if(bouquets <= 0){
            return true;
        }




        return false;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int flag = 0;
        if(n < (m*k)){
            return -1;
        }

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = Integer.MAX_VALUE;

        System.out.println(low + "," +high);

    while (low <= high){
    int mid =(high+low)/2;

    boolean bouquets = checkBouquetValid(bloomDay,m,k,mid);
//        System.out.println(bouquets);

    if(bouquets){
        high = mid-1;
        flag++;
        ans = Math.min(ans,mid);
    }else {
        low = mid+1;
    }

}

        if(flag == 0){
            ans = -1;
        }

        return  ans;
    }
    public static void main(String[] args) {
        int[] nums = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        int ans = minDays(nums,m,k);
        System.out.println(ans);

    }
}