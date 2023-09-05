public class q189 {
    public static void RotateByOne(int[] arr){
        int n = arr.length-1;
        int temp = arr[n];

        for(int i = n;i>0;i--){
                arr[i] = arr[i-1];
            }

            arr[0] = temp;
        for (int i = 0;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        RotateByOne(arr);

    }
}