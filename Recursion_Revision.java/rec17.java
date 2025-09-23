public class rec17 {
  public static String ar[]= {"." ,"abc" ,"def" , "ghi" ,"jkl" , "mno" ,"pqrs", "tuv" , "wxyz" };
  public static void keypad(String str , int idx , String str2) {
    if (idx == str.length()) {
      System.out.println(str2);
      return;
    }
    char current_char = str.charAt(idx);
   String st =  ar[current_char - '0'];
   for (int i = 0; i < st.length(); i++) {
    keypad(str, idx+1, str2+st.charAt(i));
   }
  }

  public static void main(String[] args) {
    String str = "23";
    keypad(str, 0, "");
  }
}