import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//        System.out.println("this is max :)");
//        System.out.println(maxi(a,b,c));
        System.out.println("this is mini :)");
        System.out.println(mini(a,b,c));

    }
    public static int maxi(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    };


    public static int mini(int a, int b, int c){
        if (a<b){
            if(a<c){
                return a;
            }else{
                return c;
            }
        } else if (b>c) {
            return c;

        }else{
            return b;
        }
    }
}
