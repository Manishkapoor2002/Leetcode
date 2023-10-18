package Hashing;

import java.util.HashMap;
import java.util.Map;

public class mostNleastFrequency {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        Map<Integer,Integer> hmp = new HashMap<>();
        int max = v[0];
        int min = v[0];

        int[] arr = new int[2];

        for(int i : v){

            // Putting key and values in HashMap:
            if(hmp.containsKey(i)){
                hmp.put(i,hmp.get(i)+1);
            }else{
                hmp.put(i,1);
            }

            // Finding min and max:
            if (hmp.get(i) > hmp.get(max)) {
                max = i;
            } else if (hmp.get(i) == hmp.get(max) && i > max) {
                max = i;
            }

            if (hmp.get(i) < hmp.get(min)) {
                min = i;
            } else if (hmp.get(i) == hmp.get(min) && i < min) {
                min = i;
            }

        }

        arr[0] = max;
        arr[1] = min;

        return arr;




    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 4};
        int[] ans = getFrequencies(arr);
        for (int j : ans){
            System.out.print(j + " , ");
        }
    }
}