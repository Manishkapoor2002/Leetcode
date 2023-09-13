public class q2133 {


    public static boolean CheckInColumn(int[][] matrix,int j){
        int n = matrix.length;
        int num = 1;
        int count = 0;


while (n>0) {


    for (int i = 0; i < matrix.length; i++) {
//            System.out.println(matrix[i][j]);
        if (matrix[i][j] == num) {

            count++;
//            System.out.println(num +" at :"+i +" ,"+j +" with count = " +count);

            num++;
//                System.out.println(num +" at :"+i +" ,"+j +" with count = " +count);

        }

    }
    n--;
}
//        System.out.println(count +"In Column " +n);
        if(count == matrix.length){
            return true;
        }

        return false;
    }

    public static boolean CheckInRow(int[][] matrix,int i){
        int n = matrix.length;
        int num = 1;
        int count = 0;

        while (n>0){
            for (int j = 0;j< matrix.length;j++){
                if(matrix[i][j] == num){
                    count++;
                    num++;
                }
            }
            n--;
        }


//        System.out.println(count +"In Row " +n);

      if(count == matrix.length){
          return true;
      }
        return false;
    }

    public static boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0;i<n;i++){
            boolean inRow = CheckInRow(matrix,i);
            boolean inColumn = CheckInColumn(matrix,i);
            if(!inColumn || !inRow){
                return false;
            }
        }
//        System.out.println();

        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {2, 1, 3},
                {1, 3, 2},
                {3, 2, 1}};
       boolean ans = checkValid(arr);
        System.out.println(ans);


    }
}