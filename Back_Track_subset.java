public class Back_Track_subset {

  public static void Find_Subset(String str , int i , String new_str) {
    if (i == str.length()) {
      System.out.println(new_str);
      return ;
    }
    //yes choise
    Find_Subset(str ,  i+1  ,  new_str+str.charAt(i));
    //no
    Find_Subset(str, i+1, new_str);

  }
  public static void main(String[] args) {
    String str = "abc";
    Find_Subset(str, 0, "");
  }
}
