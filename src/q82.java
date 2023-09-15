public class q82 {

    public static int trap(int[] buildingHeight){
        int max = Integer.MIN_VALUE;
        int m = 0;
        for(int i = 0;i< buildingHeight.length;i++){
            max = Math.max(max,buildingHeight[i]);
            if(buildingHeight[i] == max){
                m = i;
            }
        }
//        System.out.println(m);
        int LeftWaterHold = 0;
        int Leftcurrentmax = Integer.MIN_VALUE;
        for(int i = 0;i<m;i++){
            Leftcurrentmax = Math.max(Leftcurrentmax,buildingHeight[i]);
            if(i == 0){
                LeftWaterHold += 0;
            }else{
                if(buildingHeight[i] == Leftcurrentmax){
                    LeftWaterHold += 0;
                }else{
                    LeftWaterHold += Leftcurrentmax - buildingHeight[i];
                }
            }
//    System.out.println("Leftwaterhold : "+LeftWaterHold +" currentmax : " + Leftcurrentmax +" at i =  " + i + " ,");
        }


        int RightWaterHold = 0;
        int RightcurrentMax = Integer.MIN_VALUE;

        for(int i = buildingHeight.length-1;i>m;i--){
            RightcurrentMax = Math.max(buildingHeight[i],RightcurrentMax);
            if(i == (buildingHeight.length)-1){
                RightWaterHold +=0;
            }else{
                if(buildingHeight[i] == RightcurrentMax){
                    RightWaterHold +=0;
                }else{
                    RightWaterHold += RightcurrentMax - buildingHeight[i];
                }
            }
//    System.out.println("Leftwaterhold : "+ RightWaterHold +" currentmax : " + RightcurrentMax +" at i =  " + i + " ,");

        }

        int totalWaterHold = LeftWaterHold + RightWaterHold;
        return totalWaterHold;

    }
    public static void main(String[] args) {
        int[] buildingHeight = {4,2,0,3,2,5};

        int ans = trap(buildingHeight);
        System.out.println(ans);

    }
}