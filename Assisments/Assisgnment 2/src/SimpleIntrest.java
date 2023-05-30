package src;

import java.util.Scanner;

public class SimpleIntrest {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type here you priciple ");
        int principle = input.nextInt();
        System.out.println("Type here you time ");
        int time = input.nextInt();
        System.out.println("Type here you rate ");
        int rate = input.nextInt();

        int ans = (principle*time*rate)/100;
        System.out.println(ans);
    }
}
