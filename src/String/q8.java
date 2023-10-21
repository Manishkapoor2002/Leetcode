package String;
public class q8 {

    public static int myAtoi(String s) {
        int idx = 0;
        boolean negitive = false;
        int sum = 0;
//        int wordAt = 0;
       while(idx < s.length() && s.charAt(idx) == ' '){
           idx++;
       }


//       while (idx<s.length() && s.charAt(idx) == '-'){
//           negitive = true;
//           idx++;
//       }


        if(idx<s.length()){
            if(s.charAt(idx) == '-'){
                negitive = true;
                idx++;
            }else if(s.charAt(idx) == '+'){
                idx++;
            }
        }
       for (int i =idx;i<s.length();i++){
           int isdigitOrnot = s.charAt(i);
           int c = s.charAt(i) - '0';

            if(isdigitOrnot>=48 && isdigitOrnot<=57){
                if (sum>(Integer.MAX_VALUE)/10 || sum == (Integer.MAX_VALUE/10 +1)){
                    if(negitive){
                        return Integer.MIN_VALUE;
                    }else {
                        return Integer.MAX_VALUE;
                    }
                }else {
                    sum = sum *10 + c;
                }
            }else {
                if(negitive){
                    return sum * -1;
                }else {
                    return sum;
                }
            }

       }
        if(negitive){
            return sum * -1;
        }else {
            return sum;
        }
    }
    public static void main(String[] args) {
        String  str = "2147483646";

        int ans = myAtoi(str);
        System.out.println(ans);

    }
}