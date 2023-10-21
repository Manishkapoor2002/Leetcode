package String;

import java.util.HashMap;
import java.util.Map;

public class q1781 {

    public static int DiffFrequencySubString(String str,int start,int end){

        HashMap<Character,Integer> freqMap = new HashMap<>();
        int maxfreq = Integer.MIN_VALUE;
        int minfreq= Integer.MAX_VALUE;

        for (int i = start;i<end;i++){
            char ch = str.charAt(i);
            if (freqMap.containsKey(ch)){
                freqMap.put(ch,freqMap.get(ch)+1);
            }else {
                freqMap.put(ch,1);
            }
        };

for (Map.Entry<Character,Integer> entry :freqMap.entrySet()){
    maxfreq = Math.max(maxfreq,entry.getValue());
    minfreq = Math.min(minfreq,entry.getValue());
}

//        int[] freq = new int[26];
//        int maxfreq = Integer.MIN_VALUE;
//        int minfreq= Integer.MAX_VALUE;
//        for (int i =start;i<end;i++){
//            freq[str.charAt(i) - 'a']++;
//        }
//
//
//        for (int i = 0;i<freq.length;i++){
//            if (freq[i]>maxfreq){
//                maxfreq = freq[i];
//            }
//            if (freq[i]>0 && freq[i]<minfreq){
//                minfreq= freq[i];
//            }
//        }
//
//        if (maxfreq == minfreq){
//            return 0;
//        }else {
//            return (maxfreq-minfreq);
//        }


return (maxfreq-minfreq);
    }

    public static int beautySum(String s) {
        int totalFreq = 0;

        for (int i = 0;i<s.length();i++){
            HashMap<Character,Integer> freqMap = new HashMap<>();
            int maxfreq = Integer.MIN_VALUE;
            int minfreq= Integer.MAX_VALUE;
            for (int j = i;j<s.length();j++){
                char ch = s.charAt(i);
                if (freqMap.containsKey(ch)){
                    freqMap.put(ch,freqMap.get(ch)+1);
                }else {
                    freqMap.put(ch,1);
                }
            }
        }

        return totalFreq;

    }
    public static void main(String[] args) {
        String  str = "aabcb";
        int ans= beautySum(str);
        System.out.println(ans);

    }
}