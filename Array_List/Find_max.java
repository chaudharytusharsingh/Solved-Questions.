//find max 
import java.util.ArrayList;
public class Find_max {
  public static void main(String[] args) {
    ArrayList <Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);
    list1.add(6);
    int max = Integer.MIN_VALUE;
    for (int i = 0; i <= list1.size()-1; i++) {
      if (list1.get(i) > max) {
        max = list1.get(i);
      }
      else{
        continue;
      }
    }
    System.out.println("Maximum if The Array_list is "+ max);
    System.out.println(list1);

  }
}
