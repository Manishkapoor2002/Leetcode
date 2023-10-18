package String;

public class q125 {
    public static boolean check(String str){
        int low = 0;
        int high = str.length()-1;

        while (low<high){
            char left = str.charAt(low);
            if(left>='a' && left<='z'){
//                continue;
            } else if (left>='0' && left<='9') {
//                continue;
            }else if(left>='A' && left<='Z'){
                left = (char) (left + 32);
            }else {
                low++;
                continue;
            }

            char right = str.charAt(high);

            if(right>='a' && right<='z'){
//                continue;
            } else if (right>='0' && right<='9') {
//                continue;
            }else if(right>='A' && right<='Z'){
                right = (char) (right + 32);
            }else {
                high--;
                continue;
            }

            if (left!=right){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }



    public static boolean isPalindrome(String s) {
        String test = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int low = 0;

        while (low<(test.length()-1-low)){
            if(test.charAt(low) == test.charAt(test.length()-1-low)){
                low++;
            }else {
                return false;
            }
        }


        return true;

    }
    public static void main(String[] args) {
        String str = "09qWeRtYuIoPpOiUyTrEwQ90";
        boolean ans = check(str);
        System.out.println(ans);
    }
}