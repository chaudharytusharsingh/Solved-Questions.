//TOWER OF HANOI-     ------->>>>    O(2^n)

public class rec8 {
  public static void tower_of_hanoi(int plates , String initial , String helper , String desti ) {
    if (plates==1) {
          System.out.println("pates "+ plates + " move from "+ initial +"to " + desti);

      return;
    }
    tower_of_hanoi(plates-1, initial, desti, helper);
    System.out.println("pates "+ plates + " move from "+ initial +"to " + desti);
    tower_of_hanoi(plates-1,  helper,initial, desti);
  }

  public static void main(String[] args) {
    int plates = 2;
    
    tower_of_hanoi(plates, "S", "H", "D");

  }
}

