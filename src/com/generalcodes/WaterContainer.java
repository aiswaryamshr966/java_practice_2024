package com.generalcodes;

public class WaterContainer {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int max = maxArea(height.clone());

        System.out.println("The Water That Can Be Held: "+max);

    }

    private static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left<right){
            int wide = right-left;
            int high = Math.min(height[left],height[right]);
            int area = wide*high;


            max = Math.max(max,area);

            if (height[left]<height[right]) left++;
            else if (height[left]>height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
