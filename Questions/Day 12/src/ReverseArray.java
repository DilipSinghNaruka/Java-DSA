import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[], int firstIndex, int lastIndex){
        while (firstIndex<lastIndex){
            swap( arr, firstIndex, lastIndex);
            firstIndex++;
            lastIndex--;
        }
    }
    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
