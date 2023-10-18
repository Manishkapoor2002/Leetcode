package String;
public class q1903 {

    public static String largestOddNumber(String num) {
//        long number = Integer.parseInt(num);
//        String s = "";
//
//        while (number>0){
//            int n = (int) (number%10);
//            if(n %2 == 1){
//                s = String.valueOf(number);
//                return s;
//            }
//            number = number/10;
//        }
//
//        return "";

//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        StringBuilder s = new StringBuilder();
        int lastIndex = -1;
        for(int i = num.length()-1;i>=0;i--){
            int n = num.charAt(i);
            if(n%2==1){
                lastIndex = i;
                break;
            }
        }

        if(lastIndex>=0){
            for (int i = 0 ;i<=lastIndex;i++){
                s.append(num.charAt(i));
            }
        }


        return s.toString();



    }
    public static void main(String[] args) {
        String str = "7542351161";
        String ans = largestOddNumber(str);
        System.out.println(ans);


    }
}