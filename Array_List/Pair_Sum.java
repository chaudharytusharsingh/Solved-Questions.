import java.util.ArrayList;

public class Pair_Sum {
  public static boolean Pair_Exists(ArrayList<Integer>list , int Target) {
    for (int i = 0; i < list.size(); i++) {
      for (int j= i+1; j < list.size(); j++) {
        if (list.get(i) + list.get(j) == Target) {
          return true;
        }
        else{
          continue;
        }
      }
    }
    return false;
  }
  

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 5+1; i++) {
     list.add(i); 
    }
    System.out.println(list+" ");


   System.out.println(Pair_Exists(list, 5)); 
  }
}