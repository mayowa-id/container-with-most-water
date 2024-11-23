package org.example;

public class Solution {
        public int findMaxArea(int[] heights) {
            int left = 0;
            int right = heights.length -1;
            int max = 0;
            while (left < right){
                int w = right - left;
                int h = Math.min(heights[left] , heights[right]);
                int area = h * w;
                max = Math.max(max, area);
                if(heights[left] < heights[right]) left++;
                else if (heights[left] > heights[right]) right--;
                else {
                    left++;
                    right++;
                }
            }
            return max;

        }
}
