/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0 && digits[0] == 0) {
            digits[0]++;
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int[] newD = new int[digits.length + 1];
        int index = 0;
        newD[index] =1;
        for (int digit : digits)
            newD[++index] = digit;
        return newD;
    }
}
// @lc code=end

