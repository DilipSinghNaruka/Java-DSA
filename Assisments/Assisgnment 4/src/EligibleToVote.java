import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        System.out.println("Type here your age to check :) ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(check(age)){
            System.out.println("this is eligible for vote ");
        }else{
            System.out.println("this is eligible for vote ");
        }

    }
    public static boolean check(int age){
        return age>=18;
    }
}
