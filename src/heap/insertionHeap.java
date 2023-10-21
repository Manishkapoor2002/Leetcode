package heap;

public class insertionHeap {


    public static void heapify(int[] arr,int n,int i){

        int idx = i;
//        int left


            int leftchild = 2*i;
            int rightchild = 2*i+1;

            if(leftchild< arr.length && arr[idx]<arr[leftchild]){

                idx = leftchild;

            }

            if(rightchild< arr.length && arr[idx]<arr[rightchild]){

                idx = rightchild;
            }

            if(idx!=i){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                heapify(arr,n,idx);
            }






    }


    public static int[] deletenode(int[] nums){

//        Deletion of element:
        if(nums.length == 0){
            System.out.println("NO deletion Possible");
            return  nums;
        }

        int[] arr = new int[nums.length-1];
        int idx = 1;
//        Step 1: Put last element at the first:

//        Step 2 : Removing last element:
        arr[idx] = nums[nums.length-1];

        for (int i = 2;i<arr.length;i++){
            arr[i] = nums[i];
        }
//      Step 3: Putting root node to correct position:
        while (idx< arr.length){
            int leftchild = 2*idx;
            int rightchild = 2*idx+1;

                if(leftchild< arr.length && arr[idx]<arr[leftchild]){

                    int temp = arr[idx];
                arr[idx] = arr[leftchild];
                arr[leftchild] = temp;
                idx = leftchild;

                }else if(rightchild< arr.length && arr[idx]<arr[rightchild]){

                int temp = arr[idx];
                arr[idx] = arr[rightchild];
                arr[rightchild] = temp;
                idx = rightchild;
            }else{
                    return arr;
                }
        }
        return arr;
    }

    public static int[] insertionOfNode(int[] arr, int value){

//        Insertion of element:
        int[] heap = new int[arr.length+1];
        for (int i = 1;i<arr.length;i++){
            heap[i] = arr[i];
        }

        heap[arr.length] = value;

        int idx = arr.length;

        while (idx>1){
            int parentIdx = idx/2;
            if(heap[parentIdx]<heap[idx]){
//                swapping:
                int temp = heap[parentIdx];
                heap[parentIdx] = heap[idx];
                heap[idx] = temp;
                idx = parentIdx;
            }else {
                return heap;
            }
        }

return heap;
    }


    public static void main(String[] args) {


    int[] arr = {0,55,54,53,50,52};
    int size = arr.length;

    System.out.println("Without Insertion: ");

        for (int i = 1;i<arr.length;i++){
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
        System.out.println("After Insertion: ");

    int[] maxheap = insertionOfNode(arr,60);
        System.out.print("Insertion 1nd time: (60) - > ");
        System.out.println();

        for (int i = 1;i<maxheap.length;i++){
            System.out.print(maxheap[i] + " , ");
        }
        System.out.println();

    int[] maxheap1 = insertionOfNode(maxheap,51);

        System.out.print("Insertion 2nd time: (51)->");
        System.out.println();

        for (int i = 1;i<maxheap1.length;i++){
            System.out.print(maxheap1[i] + " , ");
        }
        System.out.println();

    int[] maxheap2 = insertionOfNode(maxheap1,58);


    System.out.print("Insertion 3nd time: (58) ->");
        System.out.println();

    for (int i = 1;i<maxheap2.length;i++){
        System.out.print(maxheap2[i] + " , ");
    }
        System.out.println();


    System.out.println("After Deletion: ");

    int[] deletenode1 = deletenode(maxheap2);
        System.out.println("Deletion 1st time");

        for (int i = 1;i<deletenode1.length;i++){
            System.out.print(deletenode1[i] + " , ");
        }
        System.out.println();
        System.out.println("Deletion 2nd time");
        int[] deletenode2 = deletenode(deletenode1);

        for (int i = 1;i<deletenode2.length;i++){
            System.out.print(deletenode2[i] + " , ");
        }
        System.out.println();


//        heapify Algorith : normal arr to heap:
        int[] a = {-1,45,67,34,77,42,87,24};
        System.out.println("Before Heapify Algorithm : - > ");

        for(int i = 1;i<a.length;i++){
            System.out.print(a[i] + " , ");
        }
        System.out.println();
        int size1 = a.length;

        for (int i = size/2;i>0;i--){
                heapify(a,size1,i);
        }
        System.out.println("After Heapify Algorithm : - > ");

        for (int i = 1;i<a.length;i++){
            System.out.print(a[i] + " , ");
        }










    }
}