public class rec6 {
  public static int f1(int n) {
    if (n == 0 || n ==1) {
      return n;
    }
    return f1(n-1)+ f1(n-2);
  }

  public static void main(String[] args) {
    int n =5;
    System.out.println(f1(n));
  }
}