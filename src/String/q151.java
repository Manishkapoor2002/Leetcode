package String;

public class q151 {


    public static String substring(String s,int i,int j){
        StringBuilder str = new StringBuilder();
        for(int k = i;k<=j;k++){
            str.append(s.charAt(k));
        }

        return str.toString();
    }
    public static String reverseWords(String s) {
        int count = 0;
        int countSpace = 0;
        int startidx = -1;
        int lastidx = -1;
        StringBuilder str = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                if(count>0){
                    startidx = i+1;
                    if(countSpace==0){
                        str.append(substring(s, startidx, lastidx));
                    }
                    if(countSpace>0){
                        str.append(" ").append(substring(s, startidx, lastidx));

                    }
                    countSpace++;
                    count = 0;
                }
            }else if(s.charAt(i) != ' '){
                if(count == 0){
                    lastidx = i;
                }
                if(i == 0){
                    startidx = i;
                    if(countSpace==0){
                        str.append(substring(s, startidx, lastidx));
                    }
                    if(countSpace>0){
                        str.append(" ").append(substring(s, startidx, lastidx));

                    }
                }
                count++;

            }
        }
        return str.toString();

    }
    public static void main(String[] args) {
        String str = "EPY2giL";
        String ans  = reverseWords(str);
        System.out.println(ans);
    }
}