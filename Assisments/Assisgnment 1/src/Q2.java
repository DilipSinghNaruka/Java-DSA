import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type here first Number");
        int firstNum = input.nextInt();
        System.out.println("Type here Second Number");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;
        System.out.println("this is sum " + sum);

    }
}