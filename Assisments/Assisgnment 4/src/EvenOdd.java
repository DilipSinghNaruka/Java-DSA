import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("type here your number to check even or odd :)  ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(check(a)){
            System.out.println("this is even number");
        }else{
            System.out.println("This is odd number");
        }
    }
    public static boolean check(int a){
        return a % 2 == 0; // after using there is no requirment of if else its automatically return true false
    }
}
