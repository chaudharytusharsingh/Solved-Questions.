
// Collection Sorting
//It Is By Default Optimized In Nature In Order To Time And Space Complexity
//Import Inbuild Packages /Class/Methods
import java.util.ArrayList;
import java.util.Collections;;

public class sorting {

  // Main Method
  public static void main(String[] args) {
    // Create Array List
    ArrayList<Integer> li = new ArrayList<>();
    // Add Values In Array List
    li.add(15);
    li.add(78);
    li.add(8);
    li.add(98);
    li.add(65);
    li.add(01);
    li.add(5);
    li.add(489);
    // Print The Data Values From Array List
    System.out.println(li + "FRESH");
    Collections.sort(li);
    // Print Data Values After Sorting Ascending By Default
    System.out.println(li + "BY Default Ascending ");
    // Print Data Values After Using Collections.ReverseOrder
    Collections.sort(li, Collections.reverseOrder());
    System.out.println(li + "use collections.reverseorder for Make It Descending ");

  }
}