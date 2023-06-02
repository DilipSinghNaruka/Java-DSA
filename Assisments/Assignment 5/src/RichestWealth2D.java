import java.util.Arrays;
import java.util.Scanner;

public class RichestWealth2D {
    //https://leetcode.com/problems/richest-customer-wealth/
    //RichestWealth
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for (int row = 0; row < arr.length; row++) {
            for (int col =0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

            int temp = 0;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col =0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            if(temp<sum){
                temp = sum;
            }
        }
            System.out.println(" this is main temp "+temp);



    }
}
