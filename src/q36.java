public class q36 {

    public static boolean CheckSubboxes(char[][] board,int i,int j,char val){
        int count =0;
        int si = i *3;
        int sj = j*3;
        int maxi = si + 3;
        int maxj = sj + 3;

//        System.out.println(val);
//        System.out.println(si + " " +sj);
//        System.out.println(maxi + " " +maxj);
                for(int k = si;k<maxi;k++){
                    for(int l = sj;l<maxj;l++){
//                        System.out.print(board[k][l] +" ");

//                        System.out.print(k +" " +l +" :: ");
                        if(board[k][l] == val){
                            count++;
//                        System.out.println(si + " " +sj);
//
//                        System.out.println(maxi + " " +maxj);
//                            System.out.print(board[k][l] +" at i = "+k +" j = " +l +"  = " +val + " :: count = " +count +" ,");

                        }
                    }
//                    System.out.println();
                    if(count>1){
                        System.out.println("From SubBOX");
                        return false;
                    }
                }
//        System.out.println();

//        System.out.println(count);



    return true;
    }

    public static boolean  CheckInRowAndColumn(char[][] board,int i,int j,char val){
        int counti =0;
        int countj = 0;
      ;

        for(int k = 0;k<board.length;k++){
            if(board[i][k] == val){
//                System.out.println(i +" ");
                counti++;
//                System.out.println(board[i][k] +"at : i = " +i + ", j =" +k +" " +val);

            }
            if(board[k][j] == val){

//                System.out.println(k + " "+j);

                countj++;
//                System.out.println( +" " +val);
//                System.out.println(board[k][j] +"at : i = " +i + ", j =" +k +" " +val);


            }
        }
//        System.out.println(counti +" " +countj);
        if(counti>1 || countj>1){
//            System.out.println("From Row and Column");
            return false;
        }
return true;
    }
    public static boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        int subi = 0;
        int subj = 0;
        char current = '.';
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j] != '.'){
                    current = board[i][j];
                    subj = j/3;
                    subi = i/3;
                  boolean rowncolumn = CheckInRowAndColumn(board,i,j,current);
                  boolean subbox = CheckSubboxes(board,subi,subj,current);
                      if(!rowncolumn || !subbox){
                         return false;
                      }
//                    if(!subbox){
//                        return false;
//                    }
//                    System.out.println(board[i][j]);

                }
            }
        }
return true;
    }


    public static void main(String[] args) {
        char[][] sudoku= {
                {'.', '.', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'1', '.', '.', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '2', '.', '6', '.', '.'},
                {'.', '9', '.', '.', '.', '.', '.', '7', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'8', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

       boolean ans =  isValidSudoku(sudoku);
        System.out.println(ans);
    }
}