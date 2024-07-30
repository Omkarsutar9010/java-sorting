package sort;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {4,6,8,2,1,5};
        int n = arr.length;

        for (int i=0; i<n; i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placed
            arr[j+1] = current;
        }

        System.out.print("sorted array ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
