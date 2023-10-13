package Recursion_Basic;

public class reverseArray {


    public static void reverse(int[] arr,int i,int j){
        if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }else{
            return;
        }
        reverse(arr,i+1,j-1);

    }
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8};
        int i = 0;
        int j = arr.length-1;
        reverse(arr,i,j);
        for(int k :arr){
        System.out.print(k + " , ");
        }
    }
}