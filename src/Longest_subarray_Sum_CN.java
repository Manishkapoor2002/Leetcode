public class Longest_subarray_Sum_CN {
    public static int longestSubarraysum(int[] a,int key){
        int max = Integer.MIN_VALUE;

        for(int i = 0;i< a.length;i++){
            int sum = 0;
            int count = 0;
            for(int j = i;j< a.length;j++){
                sum += a[j];
                count++;
                if(sum == key) {
                    max = Math.max(max, count);
                }
            }

        }

        return max;
    }
    public static void main(String[] args) {
        int[] a = {1,2,1,3};
        int key = 2;
        int ans = longestSubarraysum(a,key);
        System.out.println(ans);
    }
}