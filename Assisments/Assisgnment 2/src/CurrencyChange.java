package src;

import java.util.Scanner;

public class CurrencyChange {
    //Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type here your number in rupees :) ");
        int currency = input.nextInt();
        float usdDollar = 82.72f;
        float ans = currency / usdDollar;
        System.out.println("dollar is this :) " + ans + "$");

    }
}
