import java.util.ArrayList;

public class Two_Dim_Array_List {
  public static void main(String[] args) {
    //Main_List
    ArrayList <ArrayList<Integer> >Main_List = new ArrayList<>();
    ArrayList<Integer>List_One =new ArrayList<>();
    ArrayList<Integer>List_Two =new ArrayList<>();
    ArrayList<Integer>List_Three =new ArrayList<>();
     
    for (int i = 1; i <= 5; i++) {
      List_One.add(i * 1);
      List_Two.add(i * 2);
      List_Three.add(i * 3);
    }
    Main_List.add(List_One);
    Main_List.add(List_Two);
    Main_List.add(List_Three);
    System.out.println(Main_List);

    
    for (int i = 0; i < Main_List.size(); i++) {

      ArrayList<Integer> Current_List = Main_List.get(i);

      for (int j = 0; j < Current_List.size(); j++) {
        System.out.print(Current_List.get(j)+" ");
      }
      System.out.println();
    }
    

  }
}
