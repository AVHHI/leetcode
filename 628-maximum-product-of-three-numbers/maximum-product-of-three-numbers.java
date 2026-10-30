class Solution {
    public int maximumProduct(int[] nums) {
        // int mul = 1;
        // for(int i =0 ; i < nums.length; i++){
        //     mul *= nums[i]; 
        // }
        // return mul;


        // int max = Integer.MIN_VALUE;

        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         for(int k = j + 1; k < nums.length; k++){
        //             int product = nums[i] * nums[j] * nums[k];
        //             if(product > max) {
        //                 max = product;
        //             } 
        //         }
        //     }
        // }
        // return max;



        Arrays.sort(nums);

        int n = nums.length;

        int case1 = nums[n-1] * nums[n-2] * nums[n-3];

        int case2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(case1, case2);
    }
}