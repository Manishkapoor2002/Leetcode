public class q34_Optimised {
    public static int[] searchRange(int[] nums,int target){
        int[] ans = {-1,-1};
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                break;
            }else if(target<nums[mid]){
                right = mid-1;
            }else if(target>nums[mid]){
                left = mid+1;
            }
        }


//        for ans[0]:

        while (left<=right){
            if (nums[left] == target){
                ans[0] = left;
                break;
            }else{
                left++;
            }
        }

//        for ans[1]
        while (left<=right){
            if (nums[right] == target){
                ans[1] = right;
                break;
            }else{
                right--;
            }
        }

return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 3;
        int[] ans = searchRange(nums,target);
        System.out.print("[");
        for (int i = 0;i<ans.length;i++){
            System.out.print(ans[i] + " , ");
        }
        System.out.print("]");


    }
}