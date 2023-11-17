class Solution {
    // Brute force
//    public int[] twoSum(int[] nums, int target) {
//
//        HashMap valid = new HashMap<>();
//        for(int i=0; i< nums.length; i++){
//            for(int j = i+1; j<nums.length -1; j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//
//        }
//
//        return null;
//    }

    // Hashmap
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> container = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int pairResult = target - nums[i];
            if(container.containsKey(pairResult)){
                return new int[]{container.get(pairResult), i};
            }
            container.put(nums[i], i);
        }

        return null;
    }
}