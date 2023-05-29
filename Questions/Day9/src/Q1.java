import java.util.Scanner;

// Q1 : Largest number
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();

        // method 1

//        int temp = firstNum;
//        if (temp<secondNum){
//            temp = secondNum;
//        }
//        if(temp<thirdNum){
//            temp=thirdNum;
//        }
//        System.out.println(temp);

        //method 2
        int ans = Math.max(firstNum,secondNum);
        System.out.println(Math.max(ans,thirdNum));
    }
}
