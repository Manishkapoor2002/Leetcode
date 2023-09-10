public class q169 {
    public static void MajorElement(int[] nums){

//    if(nums.length == 1){
//       max = nums[0];
//    }
//
//    int max = nums[0];
//    int maxcount = 0;
//
//    for(int i = 0;i< (nums.length/2);i++){
//        int Currcount = 0;
//        for(int j = 0;j< nums.length;j++){
//                if(nums[i]==nums[j]){
//                    Currcount++;
//
//            }
//        }
//        if(maxcount<Currcount){
//            maxcount = Currcount;
//            max = nums[i];
//        }
//
//    }
//        System.out.println(max);

//        First Sort the array:

        for(int i = 1;i< nums.length;i++){
            int curr = nums[i];
            int prev = i-1;

            while(prev>=0 && nums[prev]>curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }

        int max = nums[(nums.length/2)+1];
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        MajorElement(nums);
    }
}