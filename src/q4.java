import java.util.Arrays;

public class q4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int nm = n+m;

        int[] arr = new int[nm];
        for (int i = 0;i<nm;i++){
            if(i<n){
                arr[i] = nums1[i];
            }else{
                arr[i] = nums2[i%m];
            }
        }
        Arrays.sort(arr);
        if(nm%2==0){
            int high = nm/2;
            int low = (nm/2)-1;
            return ((double)(arr[high] + (double)arr[low])/2);
        }else{
            int mid = nm/2;
            return (double) arr[mid];
        }
    }
    public static void main(String[] args) {
        int[] num1 = {1,3,5,8};
        int[] num2 = {9,12};
        double ans =  findMedianSortedArrays(num1,num2);
        System.out.println(ans);
    }
}