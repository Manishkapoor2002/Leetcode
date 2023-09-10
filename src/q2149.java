public class q2149 {
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int even = 0;
        int odd = 1;

for (int i = 0;i< nums.length;i++){
//    positive on even place:
    if(nums[i]>0){
        ans[even] = nums[i];
        even +=2;
    }else{
        ans[odd] = nums[i];
        odd +=2;
    }
}

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(nums);
        for (int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " , ");
        }
    }
}