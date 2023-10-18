package String;

public class q796 {

    public static boolean checkRotate(String A,String B,int roate){


        for (int i = 0;i<A.length();i++){
            if(A.charAt(i)!=B.charAt((i+roate)%B.length())){
                return false;
            }
        }
        return true;
    }
    public static boolean rotateString(String s, String goal) {


        if(s.length()!=goal.length()){
            return false;
        }


        for (int i = 0;i<s.length();i++){
            if(checkRotate(s,goal,i)){
                return true;
            }
        }


        return false;

    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean ans = rotateString(s,goal);
        System.out.println(ans);


    }
}