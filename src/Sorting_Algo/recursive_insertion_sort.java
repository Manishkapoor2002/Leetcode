package Sorting_Algo;

public class recursive_insertion_sort {


    public static void Sort(int[] arr, int i) {

        if(i  == arr.length){
            return;
        }

        int j = i;
        while (j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;

            j--;
        }

        Sort(arr,i+1);

    }
    public static void main(String[] args) {
        int[] arr = {34,2,3,65,12,98,4,56,34};
//        int n = arr.length;
        int i = 1;
        Sort(arr,i);

        for (int j : arr){
            System.out.print(j +" , ");
        }


    }
}