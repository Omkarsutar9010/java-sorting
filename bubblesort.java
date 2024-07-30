package sort;

public class bubblesort {

    public static void main(String[] args) {
        int[] my_array = {4,9,2,5,1};
        int n = my_array.length;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (my_array[j]>my_array[j+1]){
                    int temp = my_array[j];
                    my_array[j]=my_array[j+1];
                    my_array[j+1]=temp;
                }
            }

        }
        System.out.print("sorted array"+" ");
        for(int i=0; i<n; i++){
            System.out.print(my_array[i]+" ");
        }
        System.out.println();
    }


}
