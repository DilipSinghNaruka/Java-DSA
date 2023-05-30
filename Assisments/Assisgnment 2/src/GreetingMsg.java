package src;

import java.util.Scanner;

public class GreetingMsg {
    //Take name as input and print a greeting message for that particular name.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name here :) ");
        String name = input.nextLine();
        System.out.println("Hello " + name + " Good Morning ");
    }
}
