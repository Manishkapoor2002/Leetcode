package String;

import java.util.HashMap;
import java.util.Map;

public class q205 {
    public static boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean>  map2 = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char froms = s.charAt(i);
            char fromt = t.charAt(i);
           if(map1.containsKey(froms)){
               if (map1.get(froms) != fromt){
                   return false;
               }
           }else {
               if(map2.containsKey(fromt)){
                   return false;
               }else {
                   map1.put(froms,fromt);
                   map2.put(fromt,true);
               }
           }
        }


        return true;
    }
    public static void main(String[] args) {
        String s = "egd";
        String t = "abb";

        boolean ans = isIsomorphic(s,t);
        System.out.println(ans);


    }
}