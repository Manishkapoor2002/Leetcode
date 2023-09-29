public class q240 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int column = m - 1;

        if(n == m && n == 1){
            if(target == matrix[row][column]){
                return true;
            }
        }

//        System.out.println(matrix[row][column]);
        while (row<n || column >= 0) {
//            System.out.println(matrix[row][column]);

            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] < target) {
                if(row<=n-2){
                    row++;
                }else{
                    return false;
                }
            } else if (matrix[row][column] > target) {
                if(column>0){
                    column--;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
        public static void main(String[] args) {
//            {{-1,3}};
            int[][] matrix ={{-1,3}};
//                    {{1},{2},{3}};
//                    {{1, 4, 7, 11, 15},
//                    {2, 5, 8, 12, 19},
//                    {3, 6, 9, 16, 22},
//                    {10, 13, 14, 17, 24},
//                    {18, 21, 23, 26, 30}};
            int target = 3;
            boolean ans = searchMatrix(matrix,target);
            System.out.println(ans);
    }
}