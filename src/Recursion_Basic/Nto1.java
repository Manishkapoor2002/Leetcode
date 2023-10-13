package Recursion_Basic;
public class Nto1 {
    public static void addNumRev(int[] arr,int num,int i){
        if(num<1){
            return;
        }
        arr[i] = num;
        addNumRev(arr,num-1,i+1);
    }    public static void main(String[] args) {
        int x = 5;
        int[] arr = new int[x];
        int i = 0;
        addNumRev(arr,x,i);

        for(int j : arr){
            System.out.println(j);
        }
    }
}