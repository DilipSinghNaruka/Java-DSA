import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if((isPrime(a))){
            System.out.println("this is prime number ");
        }else{
            System.out.println("this is not prime number ");
        }
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
            return true;


    }
}
