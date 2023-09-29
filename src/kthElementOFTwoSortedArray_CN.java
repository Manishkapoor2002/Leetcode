public class kthElementOFTwoSortedArray_CN {
    public static int kthElement(int[] nums1,int[] nums2,int k){
        int n = nums1.length;
        int m = nums2.length;
        int s = 0;
        int e = 0;
        int count = 1;

        while (s<n && e<m){
            if(nums1[s]<nums2[e]){
                if(count==k){
                    return nums1[s];
                }
                s++;
            }else{
                if(count==k){
                    return nums2[e];
                }
                e++;
            }
            count++;
        }

        while (s<n){
            if(count==k){
                return nums1[s];
            }
            s++;
            count++;
        }
        while (e<m){
            if(count==k){
                return nums2[e];
            }
            e++;
            count++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,45};
        int[] arr2 = {4,6,7,8};
        int k = 4;
        int ans = kthElement(arr1,arr2,k);
        System.out.println(ans);
    }
}