//Reverse of arraystring 
import java.util.ArrayList;
public class Reverse_no {

  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(0,5);
    list1.add(1,10);
    list1.add(2,15);
    list1.add(3,20);
    list1.add(4,25);
    System.out.println("before reverse");
    System.out.println(list1);
    


    for (int i = list1.size()-1; i >= 0 ; i--) {
      System.out.print(+list1.get(i)+" ");
    }
System.out.println("after reverse");

  }
}