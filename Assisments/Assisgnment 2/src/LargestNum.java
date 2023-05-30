package src;

import java.util.Scanner;

public class LargestNum {
    //Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        if(firstNum>secondNum){
            System.out.println("first number is greter. The Number is this :) " + firstNum);
        }else{
            System.out.println("Second number is greter. The Number is this :) " + secondNum);
        }
    }
}
