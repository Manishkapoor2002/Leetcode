public class q1539 {
    public static int findKthPositive(int[] nums, int k) {
       int n = nums.length;
       for(int i = 0;i<n;i++){
           if(nums[i]<=k){
               k++;
           }else{
               return k;
           }
       }

        return 0;
    }

    public static void main(String[] args) {
    int[] arr = {2,3,4,7,11};
    int k = 5;
    System.out.println(findKthPositive(arr,k));

    }
}
