import java.util.Scanner;

public class CircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        float pi = 3.14f;
        Scanner in = new Scanner(System.in);
        System.out.print("radius :) ");
        int r = in.nextInt();
//        System.out.println((Circumference(r, pi)));
//        System.out.print("this is Circumference :) ");

        System.out.println((AreaOfCircle(r, pi)));
        System.out.print("this is Area of Circle :) ");


    }

    public static float Circumference (float r, float pi) {
        return 2*pi*r;
    }
    public static float AreaOfCircle ( float r, float pi) {
        return pi*r*r;
    }
}
