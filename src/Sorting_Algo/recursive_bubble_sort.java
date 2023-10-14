package Sorting_Algo;

public class recursive_bubble_sort {

    public static void bubble(int[] nums,int n){
        int swapOrNot = 0;
        if(n == 1){
            return;
        }

        for (int j = 1;j<n;j++){
            if(nums[j-1]>nums[j]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                swapOrNot = 1;
            }
        }

        if (swapOrNot == 0){
            return;
        }

        bubble(nums,n-1);



    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        bubble(arr,n);


        for (int j : arr){
            System.out.print(j + " , ");
        }
    }
}