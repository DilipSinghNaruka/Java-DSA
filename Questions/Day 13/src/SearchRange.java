public class SearchRange {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5};
        int target = 3;
        search(arr,target);
    }
    static void search(int arr[], int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                System.out.println("this is present "+ i);
            }
        }
    }
}
