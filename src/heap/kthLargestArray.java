package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestArray {

    public static int kthlargestElement(int[] arr,int k){
        int j = 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0;i<arr.length;i++){
            pq.add(arr[i]);
        }

       while (j<k){
           pq.poll();
           j++;
       }
       int ans = pq.peek();

       return ans;
    }
    public static void main(String[] args) {
        int[] arr = {20,10,60,30,50,40};
        int k = 3;
        int a = kthlargestElement(arr,k);
        System.out.println(a);
    }
}