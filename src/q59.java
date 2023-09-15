public class q59 {
    public static void print(int[][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " , ");
            }
            System.out.println();
        }
    }
    public static void spiral(int n){
        int[][] arr = new int[n][n];
        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec = n-1;
        int count = 1;

        while (sr<=er || sc<=ec){
//        Top:
            for(int i = sc;i<=ec;i++){
                arr[sr][i] =count;
                count++;
            }
//            Right:

            for(int i = sr+1;i<=ec;i++){
            arr[i][ec] = count;
            count++;
            }

//            Bottom:

            for(int i = ec-1;i>=sc;i--){
                arr[er][i] = count;
                count++;
            }

//            Left:
            for(int i = er-1;i>=sr+1;i--){
                arr[i][sc] = count;
                count++;
            }
//            count++;
            sr++;
            sc++;
            ec--;
            er--;
        }
        print(arr);

    }
    public static void main(String[] args) {
        int n =1;
        spiral(n);

    }
}