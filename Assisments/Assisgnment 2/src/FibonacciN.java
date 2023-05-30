package src;

import java.util.Scanner;

public class FibonacciN {
    //To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type here your number :) ");
        int n = input.nextInt();
        int firstNum  = 0;
        int secondNum  = 1;


        for (int i = 1; i <= n; i++){

            int ans = firstNum + secondNum;
            System.out.println(ans);
            firstNum = secondNum;
            secondNum = ans;
        }
    }
}
