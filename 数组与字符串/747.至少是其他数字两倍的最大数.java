/*
 * @lc app=leetcode.cn id=747 lang=java
 *
 * [747] 至少是其他数字两倍的最大数
 */
class Solution {
    public int dominantIndex(int[] nums) {
        int maxNumberIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxNumberIndex]){
                maxNumberIndex=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=maxNumberIndex&&nums[maxNumberIndex]<nums[i]*2){
                return -1;
            }
        }
        return maxNumberIndex;
    }
}

