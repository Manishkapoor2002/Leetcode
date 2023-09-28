
public class allocateBooks {


    public static int calMaxStudent(int[] nums,int pages){
        int student = 1;
        int pageHold = 0;

        for(int i =0;i<nums.length;i++){
            if(pageHold+nums[i]<=pages){
                pageHold +=nums[i];
            }else{
                student++;
                pageHold = nums[i];
            }
        }

        return student;

    }
    public static int findPages(int[] arr, int n, int m) {

        if(n<m){
            return-1;
        }

        int low = 0;
        int high = 0;
        for (int i = 0;i<n;i++){
            low  = Math.max(low,arr[i]);
            high += arr[i];
        }
        while (low<=high){
            int mid = (low+high)/2;
            int maxStudent = calMaxStudent(arr,mid);
            if(maxStudent<=m){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int days = 2;
        int ans = findPages(nums,nums.length,days);
        System.out.println(ans);
    }
}