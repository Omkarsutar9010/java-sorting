package sort;

public class QuckSort {
    public static void quicksort(int[] arr, int low, int high){
       if (low < high){
           int pivot = partition(arr,low,high);
           quicksort(arr,low,pivot-1);
           quicksort(arr,pivot+1,high);
       }
    }
    public static int partition(int[] arr, int low, int high){
        int pi = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pi){
                i++;
                //swapping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }


    public static void main(String[] args) {
        int[] arr = {9,3,5,6,1,4,2};
        int n = arr.length;
        quicksort(arr,0,n-1);

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
