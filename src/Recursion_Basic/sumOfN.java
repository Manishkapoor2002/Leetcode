package Recursion_Basic;
public class sumOfN {

    public static int Nsum(int n,int sum){
        if(n<1){
            return sum;
        }
        sum = Nsum(n-1,sum+n);
//        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int n =10;
        int sum = 0;
        int ans = Nsum(n,sum);
        System.out.println(ans);

    }
}