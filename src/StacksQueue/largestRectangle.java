package StacksQueue;
import java.util.Stack;
public class largestRectangle {
    public static void main(String[] args) {
        int[] heights = {1,1};
        String a = "";
        System.out.println(largestRectangleAreaOptimized(heights));
    }

    public static int largestRectangleAreaOptimized(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int areaMax = 0;

        for(int i = 0; i <= heights.length; i++) {
            int currentHeight = i == heights.length ? 0 : heights[i];
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                areaMax = Math.max(areaMax, height * width);
            }
            stack.push(i);
        }

        return areaMax;
    }

    public static int largestRectangleArea(int[] heights) {

        int areaMax = 0;

        for(int i = 0; i < heights.length; i++) {
            int width = 1;

            for(int j = i - 1; j >= 0; j--){

                if(heights[j] >= heights[i]){
                    width++;
                } else {
                    break;
                }
            }

            for(int k = i + 1; k < heights.length; k++){
                if(heights[k] >= heights[i]){
                    width++;
                } else {
                    break;
                }
            }

            int height = heights[i];

            areaMax = Math.max(areaMax, height * width);
        }

        return areaMax;
    }
}

