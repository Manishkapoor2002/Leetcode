public class q4_Optimised_Binary {

    public static double median(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int nm = n+m;
        int part = (nm + 1)/2;
//        int l1,l2,r1,r2 = 0;


        if(n>m){
            return median(arr2,arr1);
        }


        int low = 0;
        int high = n;

        while (low<=high){
            int cut1 = (low+high)/2;
            int cut2 = part - cut1;

            int l1 = (cut1>0)? arr1[cut1-1]:Integer.MIN_VALUE;
            int l2 = (cut2>0)? arr2[cut2-1]:Integer.MIN_VALUE;
            int r1 = (cut1<n)? arr1[cut1]:Integer.MAX_VALUE;
            int r2 = (cut2<m)? arr2[cut2]:Integer.MAX_VALUE;




//            if(cut1<=0){
//                l1 = Integer.MIN_VALUE;
//            }else{
//                l1 = arr1[cut1-1];
//
//            }
//
//            if(cut1 >= n){
//                r1 = Integer.MAX_VALUE;
//            }else{
//                r1 = arr1[cut1];
//            }
//
//            if(cut2<=0){
//                l2 = Integer.MIN_VALUE;
//            }else{
//                l2 = arr2[cut2-1];
//            }
//            if (cut2>=m){
//                r2 = Integer.MAX_VALUE;
//            }else {
//                r2 = arr2[cut2];
//            }

            System.out.println("l1 : " +l1 + ", l2 : "+l2 +", r1 : "+r1 +", r2 :" +r2);

            if(l1<=r2 && l2<=r1){
                double median = 0;
                if(nm%2==0){
                    median = ((double) Math.max(l1,l2) +(double) Math.min(r1,r2))/2;
                }else{
                    median = Math.max(l1,l2);
                }
                return median;
            }else if(l1>r2){
                high = cut1-1;
            }else if(l2>r1){
                low = cut1+1;
            }
        }


        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        double ans = median(arr1,arr2);
        System.out.println(ans);

    }
}