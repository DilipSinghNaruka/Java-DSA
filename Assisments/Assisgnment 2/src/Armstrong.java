package src;

public class Armstrong {
    //To find Armstrong Number between two given number.

    // this is not solved 
    public static void main(String[] args) {
        int start = 0;
        int end = 200;
        for (int i = start; i <=end; i++) {
            int temp = i;
            int ans =0 ;
            while(temp>0){
                int remender =temp%10;
                temp = temp/10;
                ans = ans + (remender*remender);
                if(i==ans){
                    System.out.println(i);
                }

            }


        }

    }
}
