import javax.swing.plaf.IconUIResource;

public class MinimizeMaxDistancetoGasStation_CN {

    public static double MinDistance(int[] arr,int k){
        int n = arr.length;
       int[] howMany = new int[arr.length-1];

       for(int i = 1;i<=k;i++){
           double maxLength = -1;
            int maxIdx = -1;
           for (int j = 0;j< howMany.length;j++){
               double diff = arr[j+1] - arr[j];
               double sectionLength = diff/(double) (howMany[j]+1);
               if(maxLength<sectionLength){
                   maxLength = sectionLength;
                   maxIdx = j;
               }
           }
           howMany[maxIdx]++;
       }
       double max = -1;
       for (int i = 0;i< howMany.length;i++){
           double diff = arr[i+1] - arr[i];
           double sectionLength = diff/(double) (howMany[i]+1);
           max = Math.max(max,sectionLength);
       }

       return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 6;
        double ans = MinDistance(nums,k);
        System.out.println(ans);
    }
}
