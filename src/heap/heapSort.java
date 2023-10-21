package heap;

public class heapSort {

    public static void sortHeap(int[] nums,int n){
        int size = n;
       while (size>1){

           int temp = nums[0];
           nums[0] = nums[size-1];
           nums[size-1] = temp;

           size--;

           heapify(nums,size,0);

       }

    }
    public static void heapify(int[] nums,int n,int i){
        int maxIdx = i;
        int leftChild = (2*i)+1;
        int rightChild = (2*i)+2;

        if(leftChild<n && nums[maxIdx]<nums[leftChild]){
            maxIdx = leftChild;
        }

        if(rightChild<n && nums[maxIdx]<nums[rightChild]){
            maxIdx = rightChild;
        }

        if (maxIdx!=i){
            int temp = nums[maxIdx];
            nums[maxIdx] = nums[i];
            nums[i] = temp;
            heapify(nums,n,maxIdx);
        }


    }
    public static void main(String[] args) {
        int[] arr = {50,45,70,60,55,90,87};
        int n = arr.length;
        System.out.println("Actual Array: ");

        for (int i : arr){
            System.out.print(i +" , ");
        }

        for (int i = (n/2);i>=0;i--){
            heapify(arr,n,i);

        }
        System.out.println();
        System.out.println("After heapify : ");

        for (int i : arr){
            System.out.print(i + " , ");
        }
        System.out.println();
        System.out.println("After sorting : ");

        sortHeap(arr, arr.length);

        for (int i : arr){
            System.out.print(i +" , ");
        }
    }
}