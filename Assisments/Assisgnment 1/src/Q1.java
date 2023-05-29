import java.util.Scanner;
public class Q1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Type here days ");
            int year = input.nextInt();
            if (year == 366){
                System.out.println("this is leap year");
            }else{
                System.out.println(" this is not leap year");
            }
        }
    }

