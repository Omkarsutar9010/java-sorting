package sort;

public class bubbleDescendingOrder {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,11,102,1111};
        int n = array.length;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (array[j]<array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array ");
        for (int i=0; i<n; i++){
            System.out.print(array[i]+" ");

        }
        System.out.println();
    }
}
