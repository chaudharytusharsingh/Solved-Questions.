//swap 2 numbers
import java.util.ArrayList;
public class Swap_no {
  public static void swap(ArrayList<Integer> list , int indx1 , int indx2) {
     int temp = list.get(indx2);
     list.set(indx2, list.get(indx1));
     list.set(indx1, temp);
   
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(12);
    list.add(52);
    list.add(32);
    list.add(42);
    list.add(22);
    System.out.println("list before");
    System.out.println(list);
  
 int indx1 = 2;
 int indx2 = 5;
   swap(list, indx1, indx2);
   System.out.println(list);


  

  }
}