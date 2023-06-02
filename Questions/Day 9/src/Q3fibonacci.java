public class Q3fibonacci {
    public static void main(String[] args) {
        // fibonacci series
        int firstNum = 0;
        int secondNum = 1;
        int last = 10 ;
        for (int i = 0; i <last ; i++) {
            int sum = firstNum + secondNum;
            System.out.println("this is sum " + sum);
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}
