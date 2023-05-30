import java.util.Scanner;

public class EvenOrOdd {
    //Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type here your number to check :)");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("this is odd number");
        }else{
            System.out.println("this is even number");
        }
    }
}
