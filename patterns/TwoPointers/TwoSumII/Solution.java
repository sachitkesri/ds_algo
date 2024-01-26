package patterns.TwoPointers.TwoSumII;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0, right = numbers.length -1;
        while(left <= right){
            int targetSum = numbers[right] + numbers[left];

            if(target == targetSum){
                return new int[]{left+1, right+1};
            }

            if(targetSum > target){
                right--;
            } else{
                left++;
            }
        }

        return new int[]{};
        
    }
}
