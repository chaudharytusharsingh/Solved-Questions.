import java.util.ArrayList;


public class Contain_Most_Water {
public static int max = 0;

  // With Time Complexity (O(n^2))
  public static int holds_water(ArrayList<Integer> heights) {
    // int max = 0;
    for (int i = 0; i < heights.size(); i++) {
      for (int j = i + 1; j < heights.size(); j++) {
        int height_water = Math.min(heights.get(i), heights.get(j));
        int width_water = j - i;
        int total_water_contained = height_water * width_water;
        max = Math.max(max, total_water_contained);
      }

    }
    return max;
  }

  // Using Two Pointer Approach
  // With Time Complexity (O(n))
  public static int holds_water_efficiently(ArrayList<Integer> heights) {
    int Left_Pointer = 0;
    int Right_Pointer = heights.size() - 1;
    while (Left_Pointer < Right_Pointer) {
      // Calculate Area Of Water
      int height_hto = Math.min(heights.get(Right_Pointer), heights.get(Left_Pointer));
      int width_hto = Right_Pointer - Left_Pointer;
      int total_hto_contained = width_hto * height_hto;
      max = Math.max(total_hto_contained, max);

      // Incerement /Decrement of Pointer
      if (heights.get(Right_Pointer) < heights.get(Left_Pointer)) {
        Right_Pointer--;
      } else {
        Left_Pointer++;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    ArrayList<Integer> heights = new ArrayList<>();
    heights.add(1);
    heights.add(8);
    heights.add(6);
    heights.add(2);
    heights.add(5);
    heights.add(4);
    heights.add(8);
    heights.add(3);
    heights.add(7);
    System.out.println("Heights " + heights);

    System.out.println(holds_water(heights)+" With Time Complexity (O(n^2))");

    System.out.println(holds_water_efficiently(heights)+" With Time Complexity (O(n))");
  }
}
