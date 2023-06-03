import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr= new int[3][3];
        int target = 7;
//        System.out.println(Arrays.deepToString(arr));
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }

        }for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]) ;
            }
            System.out.println();

        }
        search2D(arr, target);
    }
    static void search2D(int[][]arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    System.out.println("this is present at " + row + " " + col );
                }
            }
            System.out.println();

        }
    }
}
