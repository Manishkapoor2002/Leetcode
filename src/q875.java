public  class q875 {

    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] dumArr = new int[n];

        System.arraycopy(piles, 0, dumArr, 0, n);


//       s
//        Finding Max:
       for(int i = 0;i<n;i++){
           if(piles[i]>max){
               max = piles[i];
           }
       }
//Finding Min
//        for(int i = 0;i<n;i++){
//            if(piles[i]<min){
//                min = piles[i];
//            }
//        }


        int k = 1;

        if(piles.length == h ){
            return max;
        }

        while(k<=max){
        System.arraycopy(dumArr,0,piles,0,n);
            int count = 0;


            for(int i = 0;i<h;i++){
                if(piles[count%n]<=k){
                    piles[count%n] = 0;
                    count++;
                }else{
                    piles[count%n] -= k;
                }
            }

            if(piles[n-1] == 0){
                return k;
            }
            k++;

        }
        return -1;

    }
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
       int ans =  minEatingSpeed(piles,h);
        System.out.println(ans);

//        for (int i = 0;i< piles.length;i++){
//            System.out.println(piles[i]);
//        }

    }
}