package Sorting_Algo;

public class insertion_sort {
    public static void main(String[] args) {
            int[] arr = {34,2,3,65,12,98,4,56,34};
            int n = arr.length;
            for (int i  = 1;i<n;i++){
                int j = i;
                while (j>0 && arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
            }

            for (int i :arr){
                System.out.print(i + " , ");
            }
    }
}
