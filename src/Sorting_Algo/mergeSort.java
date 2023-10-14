package Sorting_Algo;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {

    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();


        int left = low;
        int right = mid + 1;

        while (left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }

    }

    public static void mSort(int[] arr, int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mSort(arr,low,mid);
        mSort(arr,mid+1,high);
        merge(arr,low,mid,high);


    }
    public static void main(String[] args) {
        int[] arr = {7,4,6,2,9,3,6,4};
        int low = 0;
        int high = (arr.length)-1;
        mSort(arr,low,high);

        for (int i : arr){
            System.out.print(i + " , ");
        }
    }
}