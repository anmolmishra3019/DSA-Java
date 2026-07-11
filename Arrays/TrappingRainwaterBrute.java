import java.util.*;

public class Main {

    public static int trap(int[] height) {

        int trappedWater = 0;

        for (int i = 0; i < height.length; i++) {

            // Left Maximum
            int leftMax = height[i];
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Right Maximum
            int rightMax = height[i];
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            // Water at current index
            int waterLevel = Math.min(leftMax, rightMax);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {

        int[] height = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Trapped Water = " + trap(height));
    }
}