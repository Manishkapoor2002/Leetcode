public class q1752 {
    public static boolean check(int[] nums) {

        int rotate = 0;
        int n = nums.length;
        if(n == 1){
            return true;
        }

        while(rotate<n){

//            Checking array is rotated or not:
            int flag = 1;
            for (int i = 1;i<nums.length;i++){
                if(nums[i-1]<=nums[i]){
                    flag++;
                    continue;
                }
            }
            if (flag==nums.length){
                return true;
            }

//            rotating the aray:
            int temp = nums[n-1];
            for(int i = n-1;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;


            rotate++;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1};
       boolean ans = check(nums);
        System.out.println(ans);
    }
}