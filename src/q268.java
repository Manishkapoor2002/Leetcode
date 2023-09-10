

public class q268 {
    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = 0;
        while(n>0){
            sum +=n;
            n--;
        }
        int arrSum = 0;
        for (int i = 0;i<nums.length;i++){
            arrSum +=nums[i];
        }

        return (sum-arrSum);
//       while(n>=0){
//           int flag = 0;
//           int i = 0;
//           while(i<nums.length){
//               if(n == nums[i]){
//                   flag = 1;
//               }
//               i++;
//           }
//           if(flag==0){
//               return n;
//           }
//           n--;
//       }
    }
    public static void main(String[] args) {
        int[] nums = {2,1};
        int ans = missingNumber(nums);
        System.out.println(ans);

    }
}