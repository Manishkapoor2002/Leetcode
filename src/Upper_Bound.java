public class Upper_Bound {
    public static int upperBound(int []arr, int x, int n){
       int min = n;
       int low = 0;
       int high = n-1;
       int mid = 0;
       while(low<=high){
           mid  = (low+high)/2;

           if(arr[mid] > x){
               min = Math.min(min, mid);
               high = mid-1;
           }else{
               low = mid+1;
           }
       }
       return min;
    }

    public static void main(String[] args) {
//        1 5 5 7 7 9 10
        int[] nums = {1,5,5,7,7,9,10};
        int n = nums.length;
        int x = 5;
        int ans = upperBound(nums,x,n);
        System.out.println(ans);
    }
}