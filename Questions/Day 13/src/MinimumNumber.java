public class MinimumNumber {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,0,3};
        mini(arr);

    }
    static void mini(int arr[]){
        int mini = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<mini){
                mini= arr[i];
            }
        }
        System.out.println(mini);
    }

}
