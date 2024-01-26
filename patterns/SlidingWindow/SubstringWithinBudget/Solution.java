package patterns.SlidingWindow.SubstringWithinBudget;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int left = 0, right = 0, ans = -1, totalCost = 0, n = s.length();

        while(right < n){
            totalCost += Math.abs(s.charAt(right) - t.charAt(right));
            
            while(totalCost > maxCost){
                totalCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            ans = Math.max(ans, right - left +1);
            right++;
        }

        return ans;
    }
}