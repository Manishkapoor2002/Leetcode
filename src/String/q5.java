package String;
public class q5 {
    public static String subString(String s,int left,int right){
        StringBuilder str = new StringBuilder();
        for (int i = left;i<=right;i++){
            str.append(s.charAt(i));
        }

        return str.toString();
    }

//    public  static  boolean isPalidrome(String subString){
//
//        int low = 0;
//        int high = subString.length()-1;
//
//        while (low<high){
//            if(subString.charAt(low) != subString.charAt(high)){
//                return false;
//            }
//            low++;
//            high--;
//        }
//        return true;
//    }
    public static String longestPalindrome(String s) {
        int maxLen = Integer.MIN_VALUE;
        String maxSubString = "";

        for (int i = 0;i<s.length();i++){

            int oddleft = i;
            int oddright = i;
            while (oddleft>=0 && oddright<s.length() && s.charAt(oddleft) == s.charAt(oddright) ){

                if (oddright-oddleft+1> maxLen){
                    maxLen = oddright-oddleft+1;
                    maxSubString = subString(s,oddleft,oddright);
                }
                oddleft--;
                oddright++;
            }

            int evenleft = i;
            int evenright = i+1;
            while (evenleft>=0 && evenright<s.length() && s.charAt(evenleft) == s.charAt(evenright) ){
                if (evenright-evenleft+1>maxLen){
                    maxLen = evenright-evenleft+1;
                    maxSubString = subString(s,evenleft,evenright);
                }
                evenleft--;
                evenright++;
            }
        }

//        String maxString = "";
//        int maxLength = Integer.MIN_VALUE;
//        for (int i =0;i<s.length()-1;i++){
//            StringBuilder currSubString = new StringBuilder();
//            for (int j = i;j<s.length();j++) {
//                currSubString.append(s.charAt(j));
//                if (isPalidrome(String.valueOf(currSubString))) {
//                    int currLength = currSubString.length();
//                    maxLength = Math.max(currLength, maxLength);
//                    if (currLength == maxLength) {
//                        maxString = String.valueOf(currSubString);
//                    }
//                }
//            }
//        }

    return maxSubString;
    }
    public static void main(String[] args) {
        String str = "bbbbc";
        String ans = longestPalindrome(str);
        System.out.println(ans);
    }
}