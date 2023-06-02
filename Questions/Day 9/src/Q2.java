import java.util.Scanner;

public class Q2 {
//        Q2 : Alphabet case check
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type here your word :-");
        String word = input.next();
        char  chara = word.trim().charAt(0);
        if (chara >='a' && chara<='z' ){
            System.out.println("this is small charator");
        }else{
            System.out.println("this is capital charator");
        }
    }
}
