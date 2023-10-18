package String;

import java.util.HashMap;

public class q242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] hash = new int[26];

        for (int i = 0;i<s.length();i++){
            hash[s.charAt(i) -'a']++;
        }


        for (int i = 0;i<t.length();i++){
            hash[t.charAt(i) -'a']--;
        }

       for (int j :hash){
           if(j!=0){
               return false;
           }
       }

       return true;

    }
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        Boolean ans = isAnagram(s,t);
        System.out.println(ans);

    }
}