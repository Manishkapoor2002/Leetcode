public class q238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = new int[nums.length];
        int product = 1;
        for (int i = 0;i< nums.length;i++){
            product *= nums[i];
        }
        for (int i = 0;i< nums.length;i++){
            ans[i] = product/nums[i];
        }
    }
}