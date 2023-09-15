import java.util.ArrayList;
import java.util.List;

public class q54 {

    public static void print(List<Integer> list){
        System.out.println(list);
    }
    public static void spiralOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
//        List a = new ArrayList();
        List<Integer> list = new ArrayList<Integer>();
        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec = m-1;
        while (sr<=er && sc<=ec){


//        Top:
            for(int i = sc;i<=ec;i++){
                list.add(arr[sr][i]);
            }


//            Right:

            for(int i = sr+1;i<=er;i++){
                list.add(arr[i][ec]);
            }

            if(sr>=er || sc>=ec){
                break;
            }

//            Bottom:

            for(int i = ec-1;i>=sc;i--){
                list.add(arr[er][i]);
            }

//            Left:
            for(int i = er-1;i>=sr+1;i--){
                list.add(arr[i][sc]);
            }




            sr++;
            sc++;
            ec--;
            er--;
        }


        print(list);

//        return list;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(arr);

    }
}