package LeetCode_problems;

public class ContainerWithMostWater {

    private static int maxArea ( int[] height ) {

        int left = 0;
        int right = height.length - 1;
        int area = 0;
//        int minHeight = Math.min(height[left], height[right]);
//
//        while(left < right){
//            maxArea = Math.max(maxArea, (right - left) * minHeight);
//
//            while(left < right && height[left] <= minHeight) left++;
//            while(left  <right  && height[right] <= minHeight) right--;
//
//            minHeight = Math.min(height[left], height[right]);
//        }
//        return maxArea;

        while(left < right){
            int width = right- left;
            int currentArea = Math.min(height[left], height[right]) * width;

            area = Math.max(area, currentArea);
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return area;
    }

    public static void main ( String[] args ) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height)); // Expected output: 49

        int[] height2 = {1,1};
        System.out.println(maxArea(height2)); // Expected output: 1
    }


}
