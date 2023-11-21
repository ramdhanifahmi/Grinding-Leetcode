class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n+1) / 2;

        int actualSums = 0;
        for(int num : nums){
            actualSums += num;
        }

        return expectedSum - actualSums;
        
    }
}