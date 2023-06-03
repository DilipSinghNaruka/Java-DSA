public class SearchInString {
    public static void main(String[] args) {
        String str = "dilip";
        char target = 'p';
//        System.out.println(str);
        searchString(str, target);

    }
    static void searchString(String str, char target){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                System.out.println("yes this is present at " + i);
            }

        }
    }
}
