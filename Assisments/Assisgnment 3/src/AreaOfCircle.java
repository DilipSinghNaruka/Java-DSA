import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pi = 3.14f;
        float radius = input.nextFloat();
        float ans = pi*radius*radius;
        System.out.println("this is answer :)" + ans);


    }
}
