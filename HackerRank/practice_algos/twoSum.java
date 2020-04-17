class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] returnArray = new int[] { 0, 1 };
        int arrayLength = nums.length;
        
        for(int i = 0; i < arrayLength; i++){
            for(int j = i + 1; j < arrayLength; j++)
            {
                if(nums[j] == target - nums[i]){
                    returnArray[0] = i;
                    returnArray[1] = j;
                }
            }
        }
        return returnArray;
    }
}