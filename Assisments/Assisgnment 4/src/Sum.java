import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("type first Number :) ");
        int a = in.nextInt();
        System.out.print("type second Number :) ");
        int b = in.nextInt();
        System.out.print("this is sum to those two numbers :) ");
        System.out.print(sum(a,b));
    }

    public static int sum(int a , int b) {
        return a+b;
    }
}
