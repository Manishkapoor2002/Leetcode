package Sorting_Algo;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {34,2,3,65,12,98,4,56,34};
        int n = arr.length-1;

        while (n>0){
            int didSwap = 0;

            for (int i = 1;i<n;i++){
                if(arr[i-1]>arr[i]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0){
                break;
            }
            n--;
        }
        for(int j : arr){
            System.out.print(j +" , ");
        }
    }
}