class Permutation {
    public int[] buildArray(int[] nums) {

        //1920. Build Array from Permutation
        //https://leetcode.com/problems/build-array-from-permutation/description/


        int ans[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] =  nums[nums[i]];
        }
        return ans;
    }
}
