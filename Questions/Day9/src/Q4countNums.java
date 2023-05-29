import java.util.Scanner;

public class Q4countNums {
    // count nums
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
//        int num = 12345;
        int sum =0;
        while (num>0){
            int remender = num%10;
            num = num/10;
            sum = sum +remender;
        }
        System.out.println("sum is :) "+sum);
    }
}
