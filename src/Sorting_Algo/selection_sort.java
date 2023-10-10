package Sorting_Algo;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {34,2,3,65,12,98,4,56,34};
        int n = arr.length;

        for (int i = 0;i<n-1;i++){
//            int min = Integer.MAX_VALUE;
            int idx = i;
            for(int j = i;j<n;j++){
                if(arr[j]<arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }


        for(int j : arr){
            System.out.print(j +" , ");
        }

    }
}