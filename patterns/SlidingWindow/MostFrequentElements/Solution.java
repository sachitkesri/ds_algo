package patterns.SlidingWindow.MostFrequentElements;
import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        Arrays.sort(nums);


        int leftPtr = 0, rightPtr= 0, res= 0;
        long totalWinSum= 0;
        int len = nums.length;
        while(rightPtr < len){
            long curr = nums[rightPtr];
            totalWinSum += curr;

            while(curr * (rightPtr - leftPtr + 1) > totalWinSum + k){
                totalWinSum -= nums[leftPtr];
                leftPtr++;
            }

            res = Math.max(res, rightPtr - leftPtr + 1);
            rightPtr++;
        }

        return res;
    }
}