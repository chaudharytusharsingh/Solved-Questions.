import java.util.ArrayList;
import java.util.*;

public class Pair_Sum_opti {
  public static boolean is_pair(ArrayList<Integer>li, int target) {
    int br = 0;
    
    for (int i = 0; i < li.size(); i++) {
      
      if (li.get(i) > li.get(i+1)) {
        br = i;
        break;
      }
    }
   int Left_Pointer = br+1;
   int Right_Pointer =  br;
   int n = li.size();
   while (Left_Pointer != Right_Pointer) {
    //case1
    if (li.get(Left_Pointer) + li.get(Right_Pointer)== target) {
     return true; 
    }
//case2
 if (li.get(Left_Pointer) + li.get(Right_Pointer) < target) {
   Left_Pointer =( Left_Pointer+1) % n;
}
if (li.get(Left_Pointer) + li.get(Right_Pointer) > target) {
 Right_Pointer =  (n+Right_Pointer-1)%n;
}
   }
   return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> li = new ArrayList<>();
    li.add(11);
    li.add(15);
    li.add(6);
    li.add(8);
    li.add(9);
    li.add(10);
   System.out.println( is_pair(li, 16));

  }
}