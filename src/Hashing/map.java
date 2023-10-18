package Hashing;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,1,3,2,4,5,1,3,2};
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (int j : arr){
                if(hashMap.containsKey(j)){
                    hashMap.put(j,hashMap.get(j)+1);
                }else {
                    hashMap.put(j,1);
                }
        }
//        int n = 1;
        System.out.println(hashMap);
//            System.out.println(hashMap.containsKey(n));



    }
}