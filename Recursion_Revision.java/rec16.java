// All Substrings of "abc" 

public class rec16 {
  public static void sub_seq(String str, int idx, String str2) {
    if (idx == str.length()) {
      System.out.println(str2);
      return;
    }
    char ch = str.charAt(idx);
    // yes
    sub_seq(str, idx + 1, str2 + ch);
    // no
    sub_seq(str, idx + 1, str2);
  }

  public static void main(String[] args) {
    String str = "abc";
    String str2 = "";

    sub_seq(str, 0, str2);

  }
}