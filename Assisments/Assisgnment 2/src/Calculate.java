package src;

import java.util.Objects;
import java.util.Scanner;

public class Calculate {
    //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type here first number ");
        int firstNum = input.nextInt();
        System.out.println("type here second number ");
        int secondNum = input.nextInt();
        System.out.println("type here your oprator");
        String oprator = input.next();
        int ans ;

        if(oprator.equals( "+")){
             ans = firstNum + secondNum;
            System.out.println(ans);
        } else if (oprator.equals("-")) {
            ans = firstNum-secondNum;
            System.out.println(ans);
        }else if (oprator.equals("*")) {
            ans = firstNum*secondNum;
            System.out.println(ans);
        }else if (oprator.equals("/")) {
            ans = firstNum/secondNum;
            System.out.println(ans);
        }else {
            System.out.println("please enter valid oprator");
        }


    }
}
