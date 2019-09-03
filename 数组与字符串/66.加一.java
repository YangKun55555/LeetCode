/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 * 66.加一
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int[] plus = new int[digits.length * 2];
        int j = plus.length - 1;
        int flag = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                if (digits[i] - 9 == 0) {
                    flag = 1;
                    plus[j] = 0;
                } else {
                    plus[j] = digits[i] + 1;
                    flag=0;
                }
                j--;
            } else {
                if (digits[i] + flag == 10) {
                    flag = 1;
                    plus[j] = 0;
                } else {
                    plus[j] = digits[i]+flag;
                    flag=0;
                }
                j--;
            }
        }
        if (flag == 1) {
            plus[j] = flag;
            j--;
        }
        if (j == -1) {
            return plus;
        }
        int[] reslut = new int[plus.length - j - 1];
        for (int k = 0, m = j + 1; m < plus.length; m++, k++) {
            reslut[k] = plus[m];
        }
        return reslut;
    }
}
