package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] my_array ={2,4,8,6,1};
        int n = my_array.length;

        for (int i=0; i<n-1; i++){
            int samllest = i;
            for (int j=i+1; j<n; j++){
                if (my_array[j]<my_array[samllest]){
                    samllest = j;
                }
                //swap
                int temp = my_array[samllest];
                my_array[samllest]=my_array[i];
                my_array[i] = temp;
            }
        }
        System.out.print("sorted array ");
        for (int i=0; i<n; i++){
            System.out.print(my_array[i]+" ");
        }
        System.out.println();
    }
}
