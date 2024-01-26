package patterns.SlidingWindow.LongestSubstring;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0, right = 0, res = 0;
        
        while(right < s.length()){

            int indexOfFirstApperanceInSubString = s.indexOf(s.charAt(right), left);

            if(indexOfFirstApperanceInSubString != right){
                left = indexOfFirstApperanceInSubString + 1;
            }

            res = Math.max(res, right - left +1);
            right++;
            
        }
        return res;

    }
}