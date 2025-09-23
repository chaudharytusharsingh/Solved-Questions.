public class rec9 {
  public static void reverse(String sr, int n) {
    if (n < 0) {
      return;
    }
    char ch = sr.charAt(n);
    System.out.print(ch+"  ");
    reverse(sr,  n - 1);
    return;

  }

  public static void main(String[] args) {
    String sr = "abcdefghijklmnopqrstuvwxyz";
   
    int n = sr.length() - 1;
    reverse(sr,  n);

  }
}