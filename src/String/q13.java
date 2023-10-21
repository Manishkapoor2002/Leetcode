package String;

import java.util.HashMap;

public class q13 {
    public static int romanToInt(String s) {

        HashMap<Character,Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
//        System.out.println(roman);
        int sum = 0;

        for (int i = 0;i<s.length();i++){

            if(i < s.length()-1 && roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
                sum -= roman.get(s.charAt(i));
            }else
                sum += roman.get(s.charAt(i));
        }

        return sum;
    }
    public static void main(String[] args) {
        String str = "LVIII";
        int ans = romanToInt(str);
        System.out.println(ans);

    }
}