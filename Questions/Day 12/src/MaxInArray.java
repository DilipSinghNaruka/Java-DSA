import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int [] arr = {11,4,2,5,13};
        System.out.println(Arrays.toString(arr));

        System.out.println(maxi(arr));
    }
    static int maxi(int arr[]){
        int temp = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}
