public class Lower_Bound {
    public static int lowerBound(int []arr, int n, int x) {
    // Write your code here
    int min = n;
    int low = 0;
    int high = n-1;
    int mid = 0;
    while(low<=high){
        mid = (low+high)/2;
        if(arr[mid] >= x){
            min = Math.min(min, mid);
            high = mid-1;
        }
        if(x<arr[mid]){
            high = mid-1;
        }else{
            low = mid+1;
        }
    }
    return min;
}

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int n = nums.length;
        int x = 0;
        int ans = lowerBound(nums,n,x);
        System.out.println(ans);
    }
}