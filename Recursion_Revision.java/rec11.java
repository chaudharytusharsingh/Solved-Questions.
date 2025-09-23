public class rec11 {
  public static void rev(String str, int last_idx) {
    if (last_idx == 0) {
      System.out.println(str.charAt(last_idx));
      return;
    }
    char ch = str.charAt(last_idx);
    System.out.print(ch + " ");
    rev(str, last_idx - 1);

  }

  public static void main(String[] args) {
    String str = "anshika";
    int last_idx = str.length() - 1;
    System.out.println(last_idx);
    rev(str, last_idx);

  }
}
