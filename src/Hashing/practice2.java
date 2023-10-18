package Hashing;

public class practice2 {
    public static void main(String[] args) {
        String str = "manishkapoorabgfjhkdjasbxsagshgdtys";
        int n = str.length();
        int[] hash = new int[256];

        for (int i = 0;i<n;i++){
            hash[(str.charAt(i))]++;
        }

        int a = 'Y';
        System.out.println(hash[(a)]);

    }
}