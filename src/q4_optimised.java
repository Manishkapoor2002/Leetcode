import java.util.Arrays;

public class q4_optimised {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int nm = n+m;
        int i = 0;
        int j = 0;
        int count = 0;
        int idx1 = (nm/2)-1;
        int idx2 = nm/2;
        int idxVAL1 = -1;
        int idxVAL2 = -1;


      while (i<n && j<m){
          if(nums1[i]<nums2[j]){
              if(idx1 == count){
                  idxVAL1 = nums1[i];
              }
              if(idx2 == count){
                  idxVAL2 = nums1[i];
              }
              i++;
          }else{
              if(idx1 == count){
                  idxVAL1 = nums2[j];
              }
              if(idx2 == count){
                  idxVAL2 = nums2[j];
              }
              j++;
          }
          count++;
      }

      while (i<n){
          if(idx1 == count){
              idxVAL1 = nums1[i];
          }
          if(idx2 == count){
              idxVAL2 = nums1[i];
          }
          i++;
          count++;
      }

      while (j<m){
          if(idx1 == count){
              idxVAL1 = nums2[j];
          }
          if(idx2 == count){
              idxVAL2 = nums2[j];
          }
          j++;
          count++;
      }

      if(nm%2 == 0){
          return ((double) idxVAL1 + (double)idxVAL2)/2;
      }else{
          return (double)idxVAL2;
      }




    }
    public static void main(String[] args) {
//        10 6
//1 1 5 11 12 12 14 14 16 17
//11 15 20 20 20 20
        int[] num1 = {};
        int[] num2 = {2,3};
        double ans =  findMedianSortedArrays(num1,num2);
        System.out.println(ans);
    }
}