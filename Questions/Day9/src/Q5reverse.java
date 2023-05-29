public class Q5reverse {
    public static void main(String[] args) {
        int num = 1234;
        int sum =0;
        while(num>0){
            int remender = num%10;
            num = num/10;
             sum = sum*10+remender; //formula to reverse an number 

        }
        System.out.println(sum);
    }
}
