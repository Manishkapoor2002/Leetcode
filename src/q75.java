public class q75 {
    public static void print(int[] nums){
        for (int i =0;i< nums.length;i++){
            System.out.print(nums[i]);
        }
    }
    public static void sortColor(int[] nums){
// Brute force method
//        int n = 0;
//        int m = 0;
//        int o = 0;
//
//        for(int i = 0;i<nums.length;i++){
//            if (nums[i]==0){
//                n++;
//            }
//            if (nums[i]==1){
//                m++;
//            }
////
//        }

//        prints 0
//        for (int i = 0;i<n;i++){
//            nums[i]=0;
//        }
//
////        print 1
//        for (int i = n;i<(n+m);i++){
//            nums[i]=1;
//        }
//
////        print 2
//
//        for (int i =(n+m);i<(n+m+o);i++){
//            nums[i]=2;
//        }

//        for(int i = 0;i< nums.length;i++){
//            if(i<n){
//                nums[i]=0;
//            } else if (i>=n && i<(n+m)) {
//                nums[i] = 1;
//            }else{
//                nums[i] = 2;
//            }
//        }

//        Optimised Solution: usinf 2 loops only:
//        int k = 1;
//        int n = nums.length;
//        while(k<n){
//            for(int i = 0;i<(n-k);i++){
//                int j = i+1;
//                if(nums[i]>nums[j]){
//                    int temp = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = temp;
//                }
//            }
//            k++;
//        }

//        Optimised :
        for (int i = 1;i< nums.length;i++){
            int curr = nums[i];
            int prev = i-1;

            while(prev>=0 && nums[prev]>curr){
                nums[prev+1] = nums[prev];
            prev--;
            }
            nums[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColor(nums);
        print(nums);

    }
}