package String;

public class q14 {

    public static String longestCommonPrefix(String[] str) {
        StringBuilder s = new StringBuilder();
        int n = str.length-1;
        int minlength = Integer.MAX_VALUE;
        while(n>=0){
            if(str[n].isEmpty()){
                return "";
            }
            if(str[n].length()<minlength){
                minlength = str[n].length();
            }
            n--;
        }

        int i = 0;
        int timesame = 0;

        while (i<minlength){
            int j = 0;
            while (j<str.length-1){
                if(str[j].charAt(i) == str[j+1].charAt(i)){
                    timesame++;
                }
                j++;
            }
            if(timesame == str.length-1){
            s.append(str[j].charAt(i));
            timesame = 0;
            }else {
                return s.toString();
            }
            i++;
        }



        return s.toString();
    }
    public static void main(String[] args) {

        String[] arr = {"flower","aflow","flight"};
        String str = longestCommonPrefix(arr);
        System.out.println(str);

    }
}