package Hashing;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,1,3,2,4,5};
        int[] hash = new int[arr.length+1];

        for (int j : arr) {
            hash[j]++;
        }

        Scanner scn = new Scanner(System.in);
        int n = 5;
        while(n>0){
            int input = scn.nextInt();
            System.out.println(hash[input]);
            n--;
        }

    }
}