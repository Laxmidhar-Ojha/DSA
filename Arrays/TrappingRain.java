import java.util.*;

public class TrappingRain {
    public static void trapRain(int height[]) {
        int trappedWater = 0;
        int LeftMax[] = new int[height.length];
        int RightMax[] = new int[height.length];
        LeftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            LeftMax[i] = Math.max(LeftMax[i - 1], height[i]);
        }
        RightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            RightMax[i] = Math.max(RightMax[i + 1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            trappedWater += (Math.min(LeftMax[i], RightMax[i]) - height[i]);
        }
        System.out.println("Amount of trapped water is = " + trappedWater);
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trapRain(height);
    }

}
