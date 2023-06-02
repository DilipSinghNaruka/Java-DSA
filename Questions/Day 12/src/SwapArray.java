import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        swap(arr,0, 4 );
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
