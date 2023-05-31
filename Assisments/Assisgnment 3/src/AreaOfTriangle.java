import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b = input.nextDouble();
        double h = input.nextDouble();

        double ans = (1.0/2) * b * h;
        System.out.println(ans);
    }
}
