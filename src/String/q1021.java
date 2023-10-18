package String;
public class q1021 {
    public static void main(String[] args) {
        String str = "(()())(())(()(()))";
        String s = removeOuterParentheses(str);
        System.out.println(s);
    }

    private static String removeOuterParentheses(String str) {

        StringBuilder s = new StringBuilder();

        int count = 0;

        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '('){
                count++;
            }else {
                count--;
            }

            if(count>1 && str.charAt(i) == '(' ){
                s.append('(');
            } else if (count>=1 && str.charAt(i) == ')') {
                s.append(')');
            }
        }


        return s.toString();
    }
}